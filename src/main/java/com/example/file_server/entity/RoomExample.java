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

        public Criteria andRoomNameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("room_name =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("room_name >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("room_name <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("room_name like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("room_name not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("room_name in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "roomName");
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

        public Criteria andRoomStreamAppIsNull() {
            addCriterion("room_stream_app is null");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppIsNotNull() {
            addCriterion("room_stream_app is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppEqualTo(String value) {
            addCriterion("room_stream_app =", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppNotEqualTo(String value) {
            addCriterion("room_stream_app <>", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppGreaterThan(String value) {
            addCriterion("room_stream_app >", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppGreaterThanOrEqualTo(String value) {
            addCriterion("room_stream_app >=", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppLessThan(String value) {
            addCriterion("room_stream_app <", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppLessThanOrEqualTo(String value) {
            addCriterion("room_stream_app <=", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppLike(String value) {
            addCriterion("room_stream_app like", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppNotLike(String value) {
            addCriterion("room_stream_app not like", value, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppIn(List<String> values) {
            addCriterion("room_stream_app in", values, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppNotIn(List<String> values) {
            addCriterion("room_stream_app not in", values, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppBetween(String value1, String value2) {
            addCriterion("room_stream_app between", value1, value2, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamAppNotBetween(String value1, String value2) {
            addCriterion("room_stream_app not between", value1, value2, "roomStreamApp");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableIsNull() {
            addCriterion("room_stream_enable is null");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableIsNotNull() {
            addCriterion("room_stream_enable is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableEqualTo(Integer value) {
            addCriterion("room_stream_enable =", value, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableNotEqualTo(Integer value) {
            addCriterion("room_stream_enable <>", value, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableGreaterThan(Integer value) {
            addCriterion("room_stream_enable >", value, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_stream_enable >=", value, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableLessThan(Integer value) {
            addCriterion("room_stream_enable <", value, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableLessThanOrEqualTo(Integer value) {
            addCriterion("room_stream_enable <=", value, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableIn(List<Integer> values) {
            addCriterion("room_stream_enable in", values, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableNotIn(List<Integer> values) {
            addCriterion("room_stream_enable not in", values, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableBetween(Integer value1, Integer value2) {
            addCriterion("room_stream_enable between", value1, value2, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomStreamEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("room_stream_enable not between", value1, value2, "roomStreamEnable");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(Integer value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(Integer value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(Integer value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(Integer value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<Integer> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<Integer> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(Integer value1, Integer value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryIsNull() {
            addCriterion("room_category is null");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryIsNotNull() {
            addCriterion("room_category is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryEqualTo(String value) {
            addCriterion("room_category =", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryNotEqualTo(String value) {
            addCriterion("room_category <>", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryGreaterThan(String value) {
            addCriterion("room_category >", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("room_category >=", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryLessThan(String value) {
            addCriterion("room_category <", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryLessThanOrEqualTo(String value) {
            addCriterion("room_category <=", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryLike(String value) {
            addCriterion("room_category like", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryNotLike(String value) {
            addCriterion("room_category not like", value, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryIn(List<String> values) {
            addCriterion("room_category in", values, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryNotIn(List<String> values) {
            addCriterion("room_category not in", values, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryBetween(String value1, String value2) {
            addCriterion("room_category between", value1, value2, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCategoryNotBetween(String value1, String value2) {
            addCriterion("room_category not between", value1, value2, "roomCategory");
            return (Criteria) this;
        }

        public Criteria andRoomCoverIsNull() {
            addCriterion("room_cover is null");
            return (Criteria) this;
        }

        public Criteria andRoomCoverIsNotNull() {
            addCriterion("room_cover is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCoverEqualTo(String value) {
            addCriterion("room_cover =", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverNotEqualTo(String value) {
            addCriterion("room_cover <>", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverGreaterThan(String value) {
            addCriterion("room_cover >", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverGreaterThanOrEqualTo(String value) {
            addCriterion("room_cover >=", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverLessThan(String value) {
            addCriterion("room_cover <", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverLessThanOrEqualTo(String value) {
            addCriterion("room_cover <=", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverLike(String value) {
            addCriterion("room_cover like", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverNotLike(String value) {
            addCriterion("room_cover not like", value, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverIn(List<String> values) {
            addCriterion("room_cover in", values, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverNotIn(List<String> values) {
            addCriterion("room_cover not in", values, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverBetween(String value1, String value2) {
            addCriterion("room_cover between", value1, value2, "roomCover");
            return (Criteria) this;
        }

        public Criteria andRoomCoverNotBetween(String value1, String value2) {
            addCriterion("room_cover not between", value1, value2, "roomCover");
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

        public Criteria andRoomOnlineUsersIsNull() {
            addCriterion("room_online_users is null");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersIsNotNull() {
            addCriterion("room_online_users is not null");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersEqualTo(Integer value) {
            addCriterion("room_online_users =", value, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersNotEqualTo(Integer value) {
            addCriterion("room_online_users <>", value, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersGreaterThan(Integer value) {
            addCriterion("room_online_users >", value, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_online_users >=", value, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersLessThan(Integer value) {
            addCriterion("room_online_users <", value, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersLessThanOrEqualTo(Integer value) {
            addCriterion("room_online_users <=", value, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersIn(List<Integer> values) {
            addCriterion("room_online_users in", values, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersNotIn(List<Integer> values) {
            addCriterion("room_online_users not in", values, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersBetween(Integer value1, Integer value2) {
            addCriterion("room_online_users between", value1, value2, "roomOnlineUsers");
            return (Criteria) this;
        }

        public Criteria andRoomOnlineUsersNotBetween(Integer value1, Integer value2) {
            addCriterion("room_online_users not between", value1, value2, "roomOnlineUsers");
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