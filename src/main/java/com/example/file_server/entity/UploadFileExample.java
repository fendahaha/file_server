package com.example.file_server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadFileExample() {
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

        public Criteria andFileUniqueNameIsNull() {
            addCriterion("file_unique_name is null");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameIsNotNull() {
            addCriterion("file_unique_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameEqualTo(String value) {
            addCriterion("file_unique_name =", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameNotEqualTo(String value) {
            addCriterion("file_unique_name <>", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameGreaterThan(String value) {
            addCriterion("file_unique_name >", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_unique_name >=", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameLessThan(String value) {
            addCriterion("file_unique_name <", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameLessThanOrEqualTo(String value) {
            addCriterion("file_unique_name <=", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameLike(String value) {
            addCriterion("file_unique_name like", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameNotLike(String value) {
            addCriterion("file_unique_name not like", value, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameIn(List<String> values) {
            addCriterion("file_unique_name in", values, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameNotIn(List<String> values) {
            addCriterion("file_unique_name not in", values, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameBetween(String value1, String value2) {
            addCriterion("file_unique_name between", value1, value2, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileUniqueNameNotBetween(String value1, String value2) {
            addCriterion("file_unique_name not between", value1, value2, "fileUniqueName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameIsNull() {
            addCriterion("file_original_name is null");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameIsNotNull() {
            addCriterion("file_original_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameEqualTo(String value) {
            addCriterion("file_original_name =", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotEqualTo(String value) {
            addCriterion("file_original_name <>", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameGreaterThan(String value) {
            addCriterion("file_original_name >", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_original_name >=", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameLessThan(String value) {
            addCriterion("file_original_name <", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameLessThanOrEqualTo(String value) {
            addCriterion("file_original_name <=", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameLike(String value) {
            addCriterion("file_original_name like", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotLike(String value) {
            addCriterion("file_original_name not like", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameIn(List<String> values) {
            addCriterion("file_original_name in", values, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotIn(List<String> values) {
            addCriterion("file_original_name not in", values, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameBetween(String value1, String value2) {
            addCriterion("file_original_name between", value1, value2, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotBetween(String value1, String value2) {
            addCriterion("file_original_name not between", value1, value2, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Long value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Long value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Long value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Long value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Long value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Long> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Long> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Long value1, Long value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Long value1, Long value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFileTagsIsNull() {
            addCriterion("file_tags is null");
            return (Criteria) this;
        }

        public Criteria andFileTagsIsNotNull() {
            addCriterion("file_tags is not null");
            return (Criteria) this;
        }

        public Criteria andFileTagsEqualTo(String value) {
            addCriterion("file_tags =", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsNotEqualTo(String value) {
            addCriterion("file_tags <>", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsGreaterThan(String value) {
            addCriterion("file_tags >", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsGreaterThanOrEqualTo(String value) {
            addCriterion("file_tags >=", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsLessThan(String value) {
            addCriterion("file_tags <", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsLessThanOrEqualTo(String value) {
            addCriterion("file_tags <=", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsLike(String value) {
            addCriterion("file_tags like", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsNotLike(String value) {
            addCriterion("file_tags not like", value, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsIn(List<String> values) {
            addCriterion("file_tags in", values, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsNotIn(List<String> values) {
            addCriterion("file_tags not in", values, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsBetween(String value1, String value2) {
            addCriterion("file_tags between", value1, value2, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileTagsNotBetween(String value1, String value2) {
            addCriterion("file_tags not between", value1, value2, "fileTags");
            return (Criteria) this;
        }

        public Criteria andFileCategoryIsNull() {
            addCriterion("file_category is null");
            return (Criteria) this;
        }

        public Criteria andFileCategoryIsNotNull() {
            addCriterion("file_category is not null");
            return (Criteria) this;
        }

        public Criteria andFileCategoryEqualTo(String value) {
            addCriterion("file_category =", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryNotEqualTo(String value) {
            addCriterion("file_category <>", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryGreaterThan(String value) {
            addCriterion("file_category >", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("file_category >=", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryLessThan(String value) {
            addCriterion("file_category <", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryLessThanOrEqualTo(String value) {
            addCriterion("file_category <=", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryLike(String value) {
            addCriterion("file_category like", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryNotLike(String value) {
            addCriterion("file_category not like", value, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryIn(List<String> values) {
            addCriterion("file_category in", values, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryNotIn(List<String> values) {
            addCriterion("file_category not in", values, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryBetween(String value1, String value2) {
            addCriterion("file_category between", value1, value2, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileCategoryNotBetween(String value1, String value2) {
            addCriterion("file_category not between", value1, value2, "fileCategory");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateIsNull() {
            addCriterion("file_upload_date is null");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateIsNotNull() {
            addCriterion("file_upload_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateEqualTo(Date value) {
            addCriterion("file_upload_date =", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateNotEqualTo(Date value) {
            addCriterion("file_upload_date <>", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateGreaterThan(Date value) {
            addCriterion("file_upload_date >", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_upload_date >=", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateLessThan(Date value) {
            addCriterion("file_upload_date <", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateLessThanOrEqualTo(Date value) {
            addCriterion("file_upload_date <=", value, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateIn(List<Date> values) {
            addCriterion("file_upload_date in", values, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateNotIn(List<Date> values) {
            addCriterion("file_upload_date not in", values, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateBetween(Date value1, Date value2) {
            addCriterion("file_upload_date between", value1, value2, "fileUploadDate");
            return (Criteria) this;
        }

        public Criteria andFileUploadDateNotBetween(Date value1, Date value2) {
            addCriterion("file_upload_date not between", value1, value2, "fileUploadDate");
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