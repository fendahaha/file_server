package com.example.file_server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnchorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnchorExample() {
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

        public Criteria andUserUuidIsNull() {
            addCriterion("user_uuid is null");
            return (Criteria) this;
        }

        public Criteria andUserUuidIsNotNull() {
            addCriterion("user_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUuidEqualTo(String value) {
            addCriterion("user_uuid =", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotEqualTo(String value) {
            addCriterion("user_uuid <>", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThan(String value) {
            addCriterion("user_uuid >", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThanOrEqualTo(String value) {
            addCriterion("user_uuid >=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThan(String value) {
            addCriterion("user_uuid <", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThanOrEqualTo(String value) {
            addCriterion("user_uuid <=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLike(String value) {
            addCriterion("user_uuid like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotLike(String value) {
            addCriterion("user_uuid not like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidIn(List<String> values) {
            addCriterion("user_uuid in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotIn(List<String> values) {
            addCriterion("user_uuid not in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidBetween(String value1, String value2) {
            addCriterion("user_uuid between", value1, value2, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotBetween(String value1, String value2) {
            addCriterion("user_uuid not between", value1, value2, "userUuid");
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

        public Criteria andAnchorRemarkIsNull() {
            addCriterion("anchor_remark is null");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkIsNotNull() {
            addCriterion("anchor_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkEqualTo(String value) {
            addCriterion("anchor_remark =", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkNotEqualTo(String value) {
            addCriterion("anchor_remark <>", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkGreaterThan(String value) {
            addCriterion("anchor_remark >", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("anchor_remark >=", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkLessThan(String value) {
            addCriterion("anchor_remark <", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkLessThanOrEqualTo(String value) {
            addCriterion("anchor_remark <=", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkLike(String value) {
            addCriterion("anchor_remark like", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkNotLike(String value) {
            addCriterion("anchor_remark not like", value, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkIn(List<String> values) {
            addCriterion("anchor_remark in", values, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkNotIn(List<String> values) {
            addCriterion("anchor_remark not in", values, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkBetween(String value1, String value2) {
            addCriterion("anchor_remark between", value1, value2, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorRemarkNotBetween(String value1, String value2) {
            addCriterion("anchor_remark not between", value1, value2, "anchorRemark");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyIsNull() {
            addCriterion("anchor_money is null");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyIsNotNull() {
            addCriterion("anchor_money is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyEqualTo(Integer value) {
            addCriterion("anchor_money =", value, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyNotEqualTo(Integer value) {
            addCriterion("anchor_money <>", value, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyGreaterThan(Integer value) {
            addCriterion("anchor_money >", value, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("anchor_money >=", value, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyLessThan(Integer value) {
            addCriterion("anchor_money <", value, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("anchor_money <=", value, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyIn(List<Integer> values) {
            addCriterion("anchor_money in", values, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyNotIn(List<Integer> values) {
            addCriterion("anchor_money not in", values, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyBetween(Integer value1, Integer value2) {
            addCriterion("anchor_money between", value1, value2, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("anchor_money not between", value1, value2, "anchorMoney");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtIsNull() {
            addCriterion("anchor_create_at is null");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtIsNotNull() {
            addCriterion("anchor_create_at is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtEqualTo(Date value) {
            addCriterion("anchor_create_at =", value, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtNotEqualTo(Date value) {
            addCriterion("anchor_create_at <>", value, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtGreaterThan(Date value) {
            addCriterion("anchor_create_at >", value, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("anchor_create_at >=", value, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtLessThan(Date value) {
            addCriterion("anchor_create_at <", value, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("anchor_create_at <=", value, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtIn(List<Date> values) {
            addCriterion("anchor_create_at in", values, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtNotIn(List<Date> values) {
            addCriterion("anchor_create_at not in", values, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtBetween(Date value1, Date value2) {
            addCriterion("anchor_create_at between", value1, value2, "anchorCreateAt");
            return (Criteria) this;
        }

        public Criteria andAnchorCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("anchor_create_at not between", value1, value2, "anchorCreateAt");
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