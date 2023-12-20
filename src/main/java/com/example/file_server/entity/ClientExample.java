package com.example.file_server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        public Criteria andClientLeavelIsNull() {
            addCriterion("client_leavel is null");
            return (Criteria) this;
        }

        public Criteria andClientLeavelIsNotNull() {
            addCriterion("client_leavel is not null");
            return (Criteria) this;
        }

        public Criteria andClientLeavelEqualTo(Integer value) {
            addCriterion("client_leavel =", value, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelNotEqualTo(Integer value) {
            addCriterion("client_leavel <>", value, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelGreaterThan(Integer value) {
            addCriterion("client_leavel >", value, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_leavel >=", value, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelLessThan(Integer value) {
            addCriterion("client_leavel <", value, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelLessThanOrEqualTo(Integer value) {
            addCriterion("client_leavel <=", value, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelIn(List<Integer> values) {
            addCriterion("client_leavel in", values, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelNotIn(List<Integer> values) {
            addCriterion("client_leavel not in", values, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelBetween(Integer value1, Integer value2) {
            addCriterion("client_leavel between", value1, value2, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientLeavelNotBetween(Integer value1, Integer value2) {
            addCriterion("client_leavel not between", value1, value2, "clientLeavel");
            return (Criteria) this;
        }

        public Criteria andClientMoneyIsNull() {
            addCriterion("client_money is null");
            return (Criteria) this;
        }

        public Criteria andClientMoneyIsNotNull() {
            addCriterion("client_money is not null");
            return (Criteria) this;
        }

        public Criteria andClientMoneyEqualTo(Integer value) {
            addCriterion("client_money =", value, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyNotEqualTo(Integer value) {
            addCriterion("client_money <>", value, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyGreaterThan(Integer value) {
            addCriterion("client_money >", value, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_money >=", value, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyLessThan(Integer value) {
            addCriterion("client_money <", value, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("client_money <=", value, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyIn(List<Integer> values) {
            addCriterion("client_money in", values, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyNotIn(List<Integer> values) {
            addCriterion("client_money not in", values, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyBetween(Integer value1, Integer value2) {
            addCriterion("client_money between", value1, value2, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("client_money not between", value1, value2, "clientMoney");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedIsNull() {
            addCriterion("client_money_sended is null");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedIsNotNull() {
            addCriterion("client_money_sended is not null");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedEqualTo(Integer value) {
            addCriterion("client_money_sended =", value, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedNotEqualTo(Integer value) {
            addCriterion("client_money_sended <>", value, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedGreaterThan(Integer value) {
            addCriterion("client_money_sended >", value, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_money_sended >=", value, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedLessThan(Integer value) {
            addCriterion("client_money_sended <", value, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedLessThanOrEqualTo(Integer value) {
            addCriterion("client_money_sended <=", value, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedIn(List<Integer> values) {
            addCriterion("client_money_sended in", values, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedNotIn(List<Integer> values) {
            addCriterion("client_money_sended not in", values, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedBetween(Integer value1, Integer value2) {
            addCriterion("client_money_sended between", value1, value2, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneySendedNotBetween(Integer value1, Integer value2) {
            addCriterion("client_money_sended not between", value1, value2, "clientMoneySended");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedIsNull() {
            addCriterion("client_money_recharged is null");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedIsNotNull() {
            addCriterion("client_money_recharged is not null");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedEqualTo(Integer value) {
            addCriterion("client_money_recharged =", value, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedNotEqualTo(Integer value) {
            addCriterion("client_money_recharged <>", value, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedGreaterThan(Integer value) {
            addCriterion("client_money_recharged >", value, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_money_recharged >=", value, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedLessThan(Integer value) {
            addCriterion("client_money_recharged <", value, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedLessThanOrEqualTo(Integer value) {
            addCriterion("client_money_recharged <=", value, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedIn(List<Integer> values) {
            addCriterion("client_money_recharged in", values, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedNotIn(List<Integer> values) {
            addCriterion("client_money_recharged not in", values, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedBetween(Integer value1, Integer value2) {
            addCriterion("client_money_recharged between", value1, value2, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andClientMoneyRechargedNotBetween(Integer value1, Integer value2) {
            addCriterion("client_money_recharged not between", value1, value2, "clientMoneyRecharged");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
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