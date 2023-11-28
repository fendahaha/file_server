package com.example.file_server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SrsStreamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SrsStreamsExample() {
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

        public Criteria andServer_idIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServer_idIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServer_idEqualTo(String value) {
            addCriterion("server_id =", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idNotEqualTo(String value) {
            addCriterion("server_id <>", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idGreaterThan(String value) {
            addCriterion("server_id >", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idGreaterThanOrEqualTo(String value) {
            addCriterion("server_id >=", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idLessThan(String value) {
            addCriterion("server_id <", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idLessThanOrEqualTo(String value) {
            addCriterion("server_id <=", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idLike(String value) {
            addCriterion("server_id like", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idNotLike(String value) {
            addCriterion("server_id not like", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idIn(List<String> values) {
            addCriterion("server_id in", values, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idNotIn(List<String> values) {
            addCriterion("server_id not in", values, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idBetween(String value1, String value2) {
            addCriterion("server_id between", value1, value2, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idNotBetween(String value1, String value2) {
            addCriterion("server_id not between", value1, value2, "server_id");
            return (Criteria) this;
        }

        public Criteria andService_idIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andService_idIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andService_idEqualTo(String value) {
            addCriterion("service_id =", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idNotEqualTo(String value) {
            addCriterion("service_id <>", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idGreaterThan(String value) {
            addCriterion("service_id >", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idLessThan(String value) {
            addCriterion("service_id <", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idLike(String value) {
            addCriterion("service_id like", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idNotLike(String value) {
            addCriterion("service_id not like", value, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idIn(List<String> values) {
            addCriterion("service_id in", values, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idNotIn(List<String> values) {
            addCriterion("service_id not in", values, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "service_id");
            return (Criteria) this;
        }

        public Criteria andService_idNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "service_id");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andClient_idIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClient_idIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClient_idEqualTo(String value) {
            addCriterion("client_id =", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotEqualTo(String value) {
            addCriterion("client_id <>", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idGreaterThan(String value) {
            addCriterion("client_id >", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idLessThan(String value) {
            addCriterion("client_id <", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idLike(String value) {
            addCriterion("client_id like", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotLike(String value) {
            addCriterion("client_id not like", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idIn(List<String> values) {
            addCriterion("client_id in", values, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotIn(List<String> values) {
            addCriterion("client_id not in", values, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "client_id");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andVhostIsNull() {
            addCriterion("vhost is null");
            return (Criteria) this;
        }

        public Criteria andVhostIsNotNull() {
            addCriterion("vhost is not null");
            return (Criteria) this;
        }

        public Criteria andVhostEqualTo(String value) {
            addCriterion("vhost =", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostNotEqualTo(String value) {
            addCriterion("vhost <>", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostGreaterThan(String value) {
            addCriterion("vhost >", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostGreaterThanOrEqualTo(String value) {
            addCriterion("vhost >=", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostLessThan(String value) {
            addCriterion("vhost <", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostLessThanOrEqualTo(String value) {
            addCriterion("vhost <=", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostLike(String value) {
            addCriterion("vhost like", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostNotLike(String value) {
            addCriterion("vhost not like", value, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostIn(List<String> values) {
            addCriterion("vhost in", values, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostNotIn(List<String> values) {
            addCriterion("vhost not in", values, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostBetween(String value1, String value2) {
            addCriterion("vhost between", value1, value2, "vhost");
            return (Criteria) this;
        }

        public Criteria andVhostNotBetween(String value1, String value2) {
            addCriterion("vhost not between", value1, value2, "vhost");
            return (Criteria) this;
        }

        public Criteria andAppIsNull() {
            addCriterion("app is null");
            return (Criteria) this;
        }

        public Criteria andAppIsNotNull() {
            addCriterion("app is not null");
            return (Criteria) this;
        }

        public Criteria andAppEqualTo(String value) {
            addCriterion("app =", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotEqualTo(String value) {
            addCriterion("app <>", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThan(String value) {
            addCriterion("app >", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThanOrEqualTo(String value) {
            addCriterion("app >=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThan(String value) {
            addCriterion("app <", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThanOrEqualTo(String value) {
            addCriterion("app <=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLike(String value) {
            addCriterion("app like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotLike(String value) {
            addCriterion("app not like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppIn(List<String> values) {
            addCriterion("app in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotIn(List<String> values) {
            addCriterion("app not in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppBetween(String value1, String value2) {
            addCriterion("app between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotBetween(String value1, String value2) {
            addCriterion("app not between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andTcUrlIsNull() {
            addCriterion("tcUrl is null");
            return (Criteria) this;
        }

        public Criteria andTcUrlIsNotNull() {
            addCriterion("tcUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTcUrlEqualTo(String value) {
            addCriterion("tcUrl =", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlNotEqualTo(String value) {
            addCriterion("tcUrl <>", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlGreaterThan(String value) {
            addCriterion("tcUrl >", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlGreaterThanOrEqualTo(String value) {
            addCriterion("tcUrl >=", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlLessThan(String value) {
            addCriterion("tcUrl <", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlLessThanOrEqualTo(String value) {
            addCriterion("tcUrl <=", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlLike(String value) {
            addCriterion("tcUrl like", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlNotLike(String value) {
            addCriterion("tcUrl not like", value, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlIn(List<String> values) {
            addCriterion("tcUrl in", values, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlNotIn(List<String> values) {
            addCriterion("tcUrl not in", values, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlBetween(String value1, String value2) {
            addCriterion("tcUrl between", value1, value2, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andTcUrlNotBetween(String value1, String value2) {
            addCriterion("tcUrl not between", value1, value2, "tcUrl");
            return (Criteria) this;
        }

        public Criteria andStreamIsNull() {
            addCriterion("stream is null");
            return (Criteria) this;
        }

        public Criteria andStreamIsNotNull() {
            addCriterion("stream is not null");
            return (Criteria) this;
        }

        public Criteria andStreamEqualTo(String value) {
            addCriterion("stream =", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamNotEqualTo(String value) {
            addCriterion("stream <>", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamGreaterThan(String value) {
            addCriterion("stream >", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamGreaterThanOrEqualTo(String value) {
            addCriterion("stream >=", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamLessThan(String value) {
            addCriterion("stream <", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamLessThanOrEqualTo(String value) {
            addCriterion("stream <=", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamLike(String value) {
            addCriterion("stream like", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamNotLike(String value) {
            addCriterion("stream not like", value, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamIn(List<String> values) {
            addCriterion("stream in", values, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamNotIn(List<String> values) {
            addCriterion("stream not in", values, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamBetween(String value1, String value2) {
            addCriterion("stream between", value1, value2, "stream");
            return (Criteria) this;
        }

        public Criteria andStreamNotBetween(String value1, String value2) {
            addCriterion("stream not between", value1, value2, "stream");
            return (Criteria) this;
        }

        public Criteria andParamIsNull() {
            addCriterion("param is null");
            return (Criteria) this;
        }

        public Criteria andParamIsNotNull() {
            addCriterion("param is not null");
            return (Criteria) this;
        }

        public Criteria andParamEqualTo(String value) {
            addCriterion("param =", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotEqualTo(String value) {
            addCriterion("param <>", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThan(String value) {
            addCriterion("param >", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThanOrEqualTo(String value) {
            addCriterion("param >=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThan(String value) {
            addCriterion("param <", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThanOrEqualTo(String value) {
            addCriterion("param <=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLike(String value) {
            addCriterion("param like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotLike(String value) {
            addCriterion("param not like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamIn(List<String> values) {
            addCriterion("param in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotIn(List<String> values) {
            addCriterion("param not in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamBetween(String value1, String value2) {
            addCriterion("param between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotBetween(String value1, String value2) {
            addCriterion("param not between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andStream_urlIsNull() {
            addCriterion("stream_url is null");
            return (Criteria) this;
        }

        public Criteria andStream_urlIsNotNull() {
            addCriterion("stream_url is not null");
            return (Criteria) this;
        }

        public Criteria andStream_urlEqualTo(String value) {
            addCriterion("stream_url =", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlNotEqualTo(String value) {
            addCriterion("stream_url <>", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlGreaterThan(String value) {
            addCriterion("stream_url >", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlGreaterThanOrEqualTo(String value) {
            addCriterion("stream_url >=", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlLessThan(String value) {
            addCriterion("stream_url <", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlLessThanOrEqualTo(String value) {
            addCriterion("stream_url <=", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlLike(String value) {
            addCriterion("stream_url like", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlNotLike(String value) {
            addCriterion("stream_url not like", value, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlIn(List<String> values) {
            addCriterion("stream_url in", values, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlNotIn(List<String> values) {
            addCriterion("stream_url not in", values, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlBetween(String value1, String value2) {
            addCriterion("stream_url between", value1, value2, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_urlNotBetween(String value1, String value2) {
            addCriterion("stream_url not between", value1, value2, "stream_url");
            return (Criteria) this;
        }

        public Criteria andStream_idIsNull() {
            addCriterion("stream_id is null");
            return (Criteria) this;
        }

        public Criteria andStream_idIsNotNull() {
            addCriterion("stream_id is not null");
            return (Criteria) this;
        }

        public Criteria andStream_idEqualTo(String value) {
            addCriterion("stream_id =", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idNotEqualTo(String value) {
            addCriterion("stream_id <>", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idGreaterThan(String value) {
            addCriterion("stream_id >", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idGreaterThanOrEqualTo(String value) {
            addCriterion("stream_id >=", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idLessThan(String value) {
            addCriterion("stream_id <", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idLessThanOrEqualTo(String value) {
            addCriterion("stream_id <=", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idLike(String value) {
            addCriterion("stream_id like", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idNotLike(String value) {
            addCriterion("stream_id not like", value, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idIn(List<String> values) {
            addCriterion("stream_id in", values, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idNotIn(List<String> values) {
            addCriterion("stream_id not in", values, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idBetween(String value1, String value2) {
            addCriterion("stream_id between", value1, value2, "stream_id");
            return (Criteria) this;
        }

        public Criteria andStream_idNotBetween(String value1, String value2) {
            addCriterion("stream_id not between", value1, value2, "stream_id");
            return (Criteria) this;
        }

        public Criteria andCreate_atIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreate_atIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_atEqualTo(Date value) {
            addCriterion("create_at =", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atGreaterThan(Date value) {
            addCriterion("create_at >", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atLessThan(Date value) {
            addCriterion("create_at <", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atIn(List<Date> values) {
            addCriterion("create_at in", values, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "create_at");
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