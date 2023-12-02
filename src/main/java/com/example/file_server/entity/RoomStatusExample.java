package com.example.file_server.entity;

import java.util.ArrayList;
import java.util.List;

public class RoomStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomStatusExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRoomUuidIsNull() {
            addCriterion("room_uuid is null");
            return (Criteria) this;
        }

        public Criteria andRoomUuidIsNotNull() {
            addCriterion("room_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomUuidEqualTo(String value) {
            addCriterion("room_uuid =", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotEqualTo(String value) {
            addCriterion("room_uuid <>", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidGreaterThan(String value) {
            addCriterion("room_uuid >", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidGreaterThanOrEqualTo(String value) {
            addCriterion("room_uuid >=", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidLessThan(String value) {
            addCriterion("room_uuid <", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidLessThanOrEqualTo(String value) {
            addCriterion("room_uuid <=", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidLike(String value) {
            addCriterion("room_uuid like", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotLike(String value) {
            addCriterion("room_uuid not like", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidIn(List<String> values) {
            addCriterion("room_uuid in", values, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotIn(List<String> values) {
            addCriterion("room_uuid not in", values, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidBetween(String value1, String value2) {
            addCriterion("room_uuid between", value1, value2, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotBetween(String value1, String value2) {
            addCriterion("room_uuid not between", value1, value2, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineIsNull() {
            addCriterion("room_is_online is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineIsNotNull() {
            addCriterion("room_is_online is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineEqualTo(Integer value) {
            addCriterion("room_is_online =", value, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineNotEqualTo(Integer value) {
            addCriterion("room_is_online <>", value, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineGreaterThan(Integer value) {
            addCriterion("room_is_online >", value, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_is_online >=", value, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineLessThan(Integer value) {
            addCriterion("room_is_online <", value, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("room_is_online <=", value, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineIn(List<Integer> values) {
            addCriterion("room_is_online in", values, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineNotIn(List<Integer> values) {
            addCriterion("room_is_online not in", values, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("room_is_online between", value1, value2, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("room_is_online not between", value1, value2, "roomIsOnline");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdIsNull() {
            addCriterion("room_stream_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdIsNotNull() {
            addCriterion("room_stream_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdEqualTo(String value) {
            addCriterion("room_stream_id =", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdNotEqualTo(String value) {
            addCriterion("room_stream_id <>", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdGreaterThan(String value) {
            addCriterion("room_stream_id >", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_stream_id >=", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdLessThan(String value) {
            addCriterion("room_stream_id <", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdLessThanOrEqualTo(String value) {
            addCriterion("room_stream_id <=", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdLike(String value) {
            addCriterion("room_stream_id like", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdNotLike(String value) {
            addCriterion("room_stream_id not like", value, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdIn(List<String> values) {
            addCriterion("room_stream_id in", values, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdNotIn(List<String> values) {
            addCriterion("room_stream_id not in", values, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdBetween(String value1, String value2) {
            addCriterion("room_stream_id between", value1, value2, "roomStreamId");
            return (Criteria) this;
        }

        public Criteria andRoomStreamIdNotBetween(String value1, String value2) {
            addCriterion("room_stream_id not between", value1, value2, "roomStreamId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}