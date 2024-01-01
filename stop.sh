#!/bin/bash

# 要搜索的Java应用关键字
APP_NAME="file_server-0.0.1-SNAPSHOT.jar"

# 使用jps（Java虚拟机进程状态工具）获取Java进程列表，并查找包含关键字的进程
PID=$(jps -l | grep $APP_NAME | awk '{print $1}')

# 检查是否找到了进程ID
if [ -z "$PID" ]; then
    echo "No Java process found with name $APP_NAME."
else
    # 杀死进程
    echo "Killing Java process with PID: $PID"
    kill $PID

    # 检查进程是否成功终止
    if kill -0 $PID 2>/dev/null; then
        echo "Failed to kill process $PID. Trying 'kill -9'..."
        kill -9 $PID
    else
        echo "Process $PID killed successfully."
    fi
fi
