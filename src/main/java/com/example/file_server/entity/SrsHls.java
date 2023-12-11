package com.example.file_server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SrsHls {
    private Integer id;

    private String server_id;

    private String action;

    private String client_id;

    private String ip;

    private String vhost;

    private String app;

    private String tcUrl;

    private String stream;

    private String param;

    private String duration;

    private String cwd;

    private String file;

    private String url;

    private String m3u8;

    private String m3u8_url;

    private String seq_no;

    private String stream_url;

    private String stream_id;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date create_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServer_id() {
        return server_id;
    }

    public void setServer_id(String server_id) {
        this.server_id = server_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTcUrl() {
        return tcUrl;
    }

    public void setTcUrl(String tcUrl) {
        this.tcUrl = tcUrl;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCwd() {
        return cwd;
    }

    public void setCwd(String cwd) {
        this.cwd = cwd;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getM3u8() {
        return m3u8;
    }

    public void setM3u8(String m3u8) {
        this.m3u8 = m3u8;
    }

    public String getM3u8_url() {
        return m3u8_url;
    }

    public void setM3u8_url(String m3u8_url) {
        this.m3u8_url = m3u8_url;
    }

    public String getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(String seq_no) {
        this.seq_no = seq_no;
    }

    public String getStream_url() {
        return stream_url;
    }

    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }

    public String getStream_id() {
        return stream_id;
    }

    public void setStream_id(String stream_id) {
        this.stream_id = stream_id;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }
}