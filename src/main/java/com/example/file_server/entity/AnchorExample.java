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

        public Criteria andAnchorSanweiIsNull() {
            addCriterion("anchor_sanwei is null");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiIsNotNull() {
            addCriterion("anchor_sanwei is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiEqualTo(String value) {
            addCriterion("anchor_sanwei =", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiNotEqualTo(String value) {
            addCriterion("anchor_sanwei <>", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiGreaterThan(String value) {
            addCriterion("anchor_sanwei >", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiGreaterThanOrEqualTo(String value) {
            addCriterion("anchor_sanwei >=", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiLessThan(String value) {
            addCriterion("anchor_sanwei <", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiLessThanOrEqualTo(String value) {
            addCriterion("anchor_sanwei <=", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiLike(String value) {
            addCriterion("anchor_sanwei like", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiNotLike(String value) {
            addCriterion("anchor_sanwei not like", value, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiIn(List<String> values) {
            addCriterion("anchor_sanwei in", values, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiNotIn(List<String> values) {
            addCriterion("anchor_sanwei not in", values, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiBetween(String value1, String value2) {
            addCriterion("anchor_sanwei between", value1, value2, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorSanweiNotBetween(String value1, String value2) {
            addCriterion("anchor_sanwei not between", value1, value2, "anchorSanwei");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightIsNull() {
            addCriterion("anchor_height is null");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightIsNotNull() {
            addCriterion("anchor_height is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightEqualTo(String value) {
            addCriterion("anchor_height =", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightNotEqualTo(String value) {
            addCriterion("anchor_height <>", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightGreaterThan(String value) {
            addCriterion("anchor_height >", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightGreaterThanOrEqualTo(String value) {
            addCriterion("anchor_height >=", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightLessThan(String value) {
            addCriterion("anchor_height <", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightLessThanOrEqualTo(String value) {
            addCriterion("anchor_height <=", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightLike(String value) {
            addCriterion("anchor_height like", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightNotLike(String value) {
            addCriterion("anchor_height not like", value, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightIn(List<String> values) {
            addCriterion("anchor_height in", values, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightNotIn(List<String> values) {
            addCriterion("anchor_height not in", values, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightBetween(String value1, String value2) {
            addCriterion("anchor_height between", value1, value2, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorHeightNotBetween(String value1, String value2) {
            addCriterion("anchor_height not between", value1, value2, "anchorHeight");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtIsNull() {
            addCriterion("anchor_wieght is null");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtIsNotNull() {
            addCriterion("anchor_wieght is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtEqualTo(String value) {
            addCriterion("anchor_wieght =", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtNotEqualTo(String value) {
            addCriterion("anchor_wieght <>", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtGreaterThan(String value) {
            addCriterion("anchor_wieght >", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtGreaterThanOrEqualTo(String value) {
            addCriterion("anchor_wieght >=", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtLessThan(String value) {
            addCriterion("anchor_wieght <", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtLessThanOrEqualTo(String value) {
            addCriterion("anchor_wieght <=", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtLike(String value) {
            addCriterion("anchor_wieght like", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtNotLike(String value) {
            addCriterion("anchor_wieght not like", value, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtIn(List<String> values) {
            addCriterion("anchor_wieght in", values, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtNotIn(List<String> values) {
            addCriterion("anchor_wieght not in", values, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtBetween(String value1, String value2) {
            addCriterion("anchor_wieght between", value1, value2, "anchorWieght");
            return (Criteria) this;
        }

        public Criteria andAnchorWieghtNotBetween(String value1, String value2) {
            addCriterion("anchor_wieght not between", value1, value2, "anchorWieght");
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