package com.example.file_server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andRoomEnableIsNull() {
            addCriterion("room_enable is null");
            return (Criteria) this;
        }

        public Criteria andRoomEnableIsNotNull() {
            addCriterion("room_enable is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEnableEqualTo(Integer value) {
            addCriterion("room_enable =", value, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableNotEqualTo(Integer value) {
            addCriterion("room_enable <>", value, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableGreaterThan(Integer value) {
            addCriterion("room_enable >", value, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_enable >=", value, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableLessThan(Integer value) {
            addCriterion("room_enable <", value, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableLessThanOrEqualTo(Integer value) {
            addCriterion("room_enable <=", value, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableIn(List<Integer> values) {
            addCriterion("room_enable in", values, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableNotIn(List<Integer> values) {
            addCriterion("room_enable not in", values, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableBetween(Integer value1, Integer value2) {
            addCriterion("room_enable between", value1, value2, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("room_enable not between", value1, value2, "roomEnable");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtIsNull() {
            addCriterion("room_create_at is null");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtIsNotNull() {
            addCriterion("room_create_at is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtEqualTo(Date value) {
            addCriterion("room_create_at =", value, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtNotEqualTo(Date value) {
            addCriterion("room_create_at <>", value, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtGreaterThan(Date value) {
            addCriterion("room_create_at >", value, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("room_create_at >=", value, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtLessThan(Date value) {
            addCriterion("room_create_at <", value, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("room_create_at <=", value, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtIn(List<Date> values) {
            addCriterion("room_create_at in", values, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtNotIn(List<Date> values) {
            addCriterion("room_create_at not in", values, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtBetween(Date value1, Date value2) {
            addCriterion("room_create_at between", value1, value2, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andRoomCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("room_create_at not between", value1, value2, "roomCreateAt");
            return (Criteria) this;
        }

        public Criteria andStreamTypeIsNull() {
            addCriterion("stream_type is null");
            return (Criteria) this;
        }

        public Criteria andStreamTypeIsNotNull() {
            addCriterion("stream_type is not null");
            return (Criteria) this;
        }

        public Criteria andStreamTypeEqualTo(String value) {
            addCriterion("stream_type =", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeNotEqualTo(String value) {
            addCriterion("stream_type <>", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeGreaterThan(String value) {
            addCriterion("stream_type >", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stream_type >=", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeLessThan(String value) {
            addCriterion("stream_type <", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeLessThanOrEqualTo(String value) {
            addCriterion("stream_type <=", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeLike(String value) {
            addCriterion("stream_type like", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeNotLike(String value) {
            addCriterion("stream_type not like", value, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeIn(List<String> values) {
            addCriterion("stream_type in", values, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeNotIn(List<String> values) {
            addCriterion("stream_type not in", values, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeBetween(String value1, String value2) {
            addCriterion("stream_type between", value1, value2, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamTypeNotBetween(String value1, String value2) {
            addCriterion("stream_type not between", value1, value2, "streamType");
            return (Criteria) this;
        }

        public Criteria andStreamAddressIsNull() {
            addCriterion("stream_address is null");
            return (Criteria) this;
        }

        public Criteria andStreamAddressIsNotNull() {
            addCriterion("stream_address is not null");
            return (Criteria) this;
        }

        public Criteria andStreamAddressEqualTo(String value) {
            addCriterion("stream_address =", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressNotEqualTo(String value) {
            addCriterion("stream_address <>", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressGreaterThan(String value) {
            addCriterion("stream_address >", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressGreaterThanOrEqualTo(String value) {
            addCriterion("stream_address >=", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressLessThan(String value) {
            addCriterion("stream_address <", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressLessThanOrEqualTo(String value) {
            addCriterion("stream_address <=", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressLike(String value) {
            addCriterion("stream_address like", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressNotLike(String value) {
            addCriterion("stream_address not like", value, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressIn(List<String> values) {
            addCriterion("stream_address in", values, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressNotIn(List<String> values) {
            addCriterion("stream_address not in", values, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressBetween(String value1, String value2) {
            addCriterion("stream_address between", value1, value2, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAddressNotBetween(String value1, String value2) {
            addCriterion("stream_address not between", value1, value2, "streamAddress");
            return (Criteria) this;
        }

        public Criteria andStreamAppIsNull() {
            addCriterion("stream_app is null");
            return (Criteria) this;
        }

        public Criteria andStreamAppIsNotNull() {
            addCriterion("stream_app is not null");
            return (Criteria) this;
        }

        public Criteria andStreamAppEqualTo(String value) {
            addCriterion("stream_app =", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppNotEqualTo(String value) {
            addCriterion("stream_app <>", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppGreaterThan(String value) {
            addCriterion("stream_app >", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppGreaterThanOrEqualTo(String value) {
            addCriterion("stream_app >=", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppLessThan(String value) {
            addCriterion("stream_app <", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppLessThanOrEqualTo(String value) {
            addCriterion("stream_app <=", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppLike(String value) {
            addCriterion("stream_app like", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppNotLike(String value) {
            addCriterion("stream_app not like", value, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppIn(List<String> values) {
            addCriterion("stream_app in", values, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppNotIn(List<String> values) {
            addCriterion("stream_app not in", values, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppBetween(String value1, String value2) {
            addCriterion("stream_app between", value1, value2, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamAppNotBetween(String value1, String value2) {
            addCriterion("stream_app not between", value1, value2, "streamApp");
            return (Criteria) this;
        }

        public Criteria andStreamNameIsNull() {
            addCriterion("stream_name is null");
            return (Criteria) this;
        }

        public Criteria andStreamNameIsNotNull() {
            addCriterion("stream_name is not null");
            return (Criteria) this;
        }

        public Criteria andStreamNameEqualTo(String value) {
            addCriterion("stream_name =", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotEqualTo(String value) {
            addCriterion("stream_name <>", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameGreaterThan(String value) {
            addCriterion("stream_name >", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameGreaterThanOrEqualTo(String value) {
            addCriterion("stream_name >=", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameLessThan(String value) {
            addCriterion("stream_name <", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameLessThanOrEqualTo(String value) {
            addCriterion("stream_name <=", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameLike(String value) {
            addCriterion("stream_name like", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotLike(String value) {
            addCriterion("stream_name not like", value, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameIn(List<String> values) {
            addCriterion("stream_name in", values, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotIn(List<String> values) {
            addCriterion("stream_name not in", values, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameBetween(String value1, String value2) {
            addCriterion("stream_name between", value1, value2, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamNameNotBetween(String value1, String value2) {
            addCriterion("stream_name not between", value1, value2, "streamName");
            return (Criteria) this;
        }

        public Criteria andStreamParamIsNull() {
            addCriterion("stream_param is null");
            return (Criteria) this;
        }

        public Criteria andStreamParamIsNotNull() {
            addCriterion("stream_param is not null");
            return (Criteria) this;
        }

        public Criteria andStreamParamEqualTo(String value) {
            addCriterion("stream_param =", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamNotEqualTo(String value) {
            addCriterion("stream_param <>", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamGreaterThan(String value) {
            addCriterion("stream_param >", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamGreaterThanOrEqualTo(String value) {
            addCriterion("stream_param >=", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamLessThan(String value) {
            addCriterion("stream_param <", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamLessThanOrEqualTo(String value) {
            addCriterion("stream_param <=", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamLike(String value) {
            addCriterion("stream_param like", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamNotLike(String value) {
            addCriterion("stream_param not like", value, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamIn(List<String> values) {
            addCriterion("stream_param in", values, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamNotIn(List<String> values) {
            addCriterion("stream_param not in", values, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamBetween(String value1, String value2) {
            addCriterion("stream_param between", value1, value2, "streamParam");
            return (Criteria) this;
        }

        public Criteria andStreamParamNotBetween(String value1, String value2) {
            addCriterion("stream_param not between", value1, value2, "streamParam");
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