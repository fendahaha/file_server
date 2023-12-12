package com.example.file_server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftSendRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftSendRecordExample() {
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

        public Criteria andGiftSendUuidIsNull() {
            addCriterion("gift_send_uuid is null");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidIsNotNull() {
            addCriterion("gift_send_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidEqualTo(String value) {
            addCriterion("gift_send_uuid =", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidNotEqualTo(String value) {
            addCriterion("gift_send_uuid <>", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidGreaterThan(String value) {
            addCriterion("gift_send_uuid >", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidGreaterThanOrEqualTo(String value) {
            addCriterion("gift_send_uuid >=", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidLessThan(String value) {
            addCriterion("gift_send_uuid <", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidLessThanOrEqualTo(String value) {
            addCriterion("gift_send_uuid <=", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidLike(String value) {
            addCriterion("gift_send_uuid like", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidNotLike(String value) {
            addCriterion("gift_send_uuid not like", value, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidIn(List<String> values) {
            addCriterion("gift_send_uuid in", values, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidNotIn(List<String> values) {
            addCriterion("gift_send_uuid not in", values, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidBetween(String value1, String value2) {
            addCriterion("gift_send_uuid between", value1, value2, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendUuidNotBetween(String value1, String value2) {
            addCriterion("gift_send_uuid not between", value1, value2, "giftSendUuid");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateIsNull() {
            addCriterion("gift_send_date is null");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateIsNotNull() {
            addCriterion("gift_send_date is not null");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateEqualTo(Date value) {
            addCriterion("gift_send_date =", value, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateNotEqualTo(Date value) {
            addCriterion("gift_send_date <>", value, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateGreaterThan(Date value) {
            addCriterion("gift_send_date >", value, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("gift_send_date >=", value, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateLessThan(Date value) {
            addCriterion("gift_send_date <", value, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateLessThanOrEqualTo(Date value) {
            addCriterion("gift_send_date <=", value, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateIn(List<Date> values) {
            addCriterion("gift_send_date in", values, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateNotIn(List<Date> values) {
            addCriterion("gift_send_date not in", values, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateBetween(Date value1, Date value2) {
            addCriterion("gift_send_date between", value1, value2, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andGiftSendDateNotBetween(Date value1, Date value2) {
            addCriterion("gift_send_date not between", value1, value2, "giftSendDate");
            return (Criteria) this;
        }

        public Criteria andClientUuidIsNull() {
            addCriterion("client_uuid is null");
            return (Criteria) this;
        }

        public Criteria andClientUuidIsNotNull() {
            addCriterion("client_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andClientUuidEqualTo(String value) {
            addCriterion("client_uuid =", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidNotEqualTo(String value) {
            addCriterion("client_uuid <>", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidGreaterThan(String value) {
            addCriterion("client_uuid >", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidGreaterThanOrEqualTo(String value) {
            addCriterion("client_uuid >=", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidLessThan(String value) {
            addCriterion("client_uuid <", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidLessThanOrEqualTo(String value) {
            addCriterion("client_uuid <=", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidLike(String value) {
            addCriterion("client_uuid like", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidNotLike(String value) {
            addCriterion("client_uuid not like", value, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidIn(List<String> values) {
            addCriterion("client_uuid in", values, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidNotIn(List<String> values) {
            addCriterion("client_uuid not in", values, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidBetween(String value1, String value2) {
            addCriterion("client_uuid between", value1, value2, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andClientUuidNotBetween(String value1, String value2) {
            addCriterion("client_uuid not between", value1, value2, "clientUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidIsNull() {
            addCriterion("anchor_uuid is null");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidIsNotNull() {
            addCriterion("anchor_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidEqualTo(String value) {
            addCriterion("anchor_uuid =", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidNotEqualTo(String value) {
            addCriterion("anchor_uuid <>", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidGreaterThan(String value) {
            addCriterion("anchor_uuid >", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidGreaterThanOrEqualTo(String value) {
            addCriterion("anchor_uuid >=", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidLessThan(String value) {
            addCriterion("anchor_uuid <", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidLessThanOrEqualTo(String value) {
            addCriterion("anchor_uuid <=", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidLike(String value) {
            addCriterion("anchor_uuid like", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidNotLike(String value) {
            addCriterion("anchor_uuid not like", value, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidIn(List<String> values) {
            addCriterion("anchor_uuid in", values, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidNotIn(List<String> values) {
            addCriterion("anchor_uuid not in", values, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidBetween(String value1, String value2) {
            addCriterion("anchor_uuid between", value1, value2, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andAnchorUuidNotBetween(String value1, String value2) {
            addCriterion("anchor_uuid not between", value1, value2, "anchorUuid");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameIsNull() {
            addCriterion("anchor_name is null");
            return (Criteria) this;
        }

        public Criteria andAnchorNameIsNotNull() {
            addCriterion("anchor_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorNameEqualTo(String value) {
            addCriterion("anchor_name =", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameNotEqualTo(String value) {
            addCriterion("anchor_name <>", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameGreaterThan(String value) {
            addCriterion("anchor_name >", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameGreaterThanOrEqualTo(String value) {
            addCriterion("anchor_name >=", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameLessThan(String value) {
            addCriterion("anchor_name <", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameLessThanOrEqualTo(String value) {
            addCriterion("anchor_name <=", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameLike(String value) {
            addCriterion("anchor_name like", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameNotLike(String value) {
            addCriterion("anchor_name not like", value, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameIn(List<String> values) {
            addCriterion("anchor_name in", values, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameNotIn(List<String> values) {
            addCriterion("anchor_name not in", values, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameBetween(String value1, String value2) {
            addCriterion("anchor_name between", value1, value2, "anchorName");
            return (Criteria) this;
        }

        public Criteria andAnchorNameNotBetween(String value1, String value2) {
            addCriterion("anchor_name not between", value1, value2, "anchorName");
            return (Criteria) this;
        }

        public Criteria andGiftUuidIsNull() {
            addCriterion("gift_uuid is null");
            return (Criteria) this;
        }

        public Criteria andGiftUuidIsNotNull() {
            addCriterion("gift_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andGiftUuidEqualTo(String value) {
            addCriterion("gift_uuid =", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidNotEqualTo(String value) {
            addCriterion("gift_uuid <>", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidGreaterThan(String value) {
            addCriterion("gift_uuid >", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidGreaterThanOrEqualTo(String value) {
            addCriterion("gift_uuid >=", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidLessThan(String value) {
            addCriterion("gift_uuid <", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidLessThanOrEqualTo(String value) {
            addCriterion("gift_uuid <=", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidLike(String value) {
            addCriterion("gift_uuid like", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidNotLike(String value) {
            addCriterion("gift_uuid not like", value, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidIn(List<String> values) {
            addCriterion("gift_uuid in", values, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidNotIn(List<String> values) {
            addCriterion("gift_uuid not in", values, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidBetween(String value1, String value2) {
            addCriterion("gift_uuid between", value1, value2, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftUuidNotBetween(String value1, String value2) {
            addCriterion("gift_uuid not between", value1, value2, "giftUuid");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNull() {
            addCriterion("gift_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNotNull() {
            addCriterion("gift_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualTo(String value) {
            addCriterion("gift_name =", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualTo(String value) {
            addCriterion("gift_name <>", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThan(String value) {
            addCriterion("gift_name >", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_name >=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThan(String value) {
            addCriterion("gift_name <", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualTo(String value) {
            addCriterion("gift_name <=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLike(String value) {
            addCriterion("gift_name like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotLike(String value) {
            addCriterion("gift_name not like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameIn(List<String> values) {
            addCriterion("gift_name in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotIn(List<String> values) {
            addCriterion("gift_name not in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameBetween(String value1, String value2) {
            addCriterion("gift_name between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotBetween(String value1, String value2) {
            addCriterion("gift_name not between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftValueIsNull() {
            addCriterion("gift_value is null");
            return (Criteria) this;
        }

        public Criteria andGiftValueIsNotNull() {
            addCriterion("gift_value is not null");
            return (Criteria) this;
        }

        public Criteria andGiftValueEqualTo(Integer value) {
            addCriterion("gift_value =", value, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueNotEqualTo(Integer value) {
            addCriterion("gift_value <>", value, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueGreaterThan(Integer value) {
            addCriterion("gift_value >", value, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_value >=", value, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueLessThan(Integer value) {
            addCriterion("gift_value <", value, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueLessThanOrEqualTo(Integer value) {
            addCriterion("gift_value <=", value, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueIn(List<Integer> values) {
            addCriterion("gift_value in", values, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueNotIn(List<Integer> values) {
            addCriterion("gift_value not in", values, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueBetween(Integer value1, Integer value2) {
            addCriterion("gift_value between", value1, value2, "giftValue");
            return (Criteria) this;
        }

        public Criteria andGiftValueNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_value not between", value1, value2, "giftValue");
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