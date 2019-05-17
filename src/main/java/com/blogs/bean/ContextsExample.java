package com.blogs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContextsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContextsExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andContextsIdIsNull() {
            addCriterion("contexts_id is null");
            return (Criteria) this;
        }

        public Criteria andContextsIdIsNotNull() {
            addCriterion("contexts_id is not null");
            return (Criteria) this;
        }

        public Criteria andContextsIdEqualTo(Integer value) {
            addCriterion("contexts_id =", value, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdNotEqualTo(Integer value) {
            addCriterion("contexts_id <>", value, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdGreaterThan(Integer value) {
            addCriterion("contexts_id >", value, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contexts_id >=", value, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdLessThan(Integer value) {
            addCriterion("contexts_id <", value, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdLessThanOrEqualTo(Integer value) {
            addCriterion("contexts_id <=", value, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdIn(List<Integer> values) {
            addCriterion("contexts_id in", values, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdNotIn(List<Integer> values) {
            addCriterion("contexts_id not in", values, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdBetween(Integer value1, Integer value2) {
            addCriterion("contexts_id between", value1, value2, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contexts_id not between", value1, value2, "contextsId");
            return (Criteria) this;
        }

        public Criteria andContextsTitleIsNull() {
            addCriterion("contexts_title is null");
            return (Criteria) this;
        }

        public Criteria andContextsTitleIsNotNull() {
            addCriterion("contexts_title is not null");
            return (Criteria) this;
        }

        public Criteria andContextsTitleEqualTo(String value) {
            addCriterion("contexts_title =", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleNotEqualTo(String value) {
            addCriterion("contexts_title <>", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleGreaterThan(String value) {
            addCriterion("contexts_title >", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("contexts_title >=", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleLessThan(String value) {
            addCriterion("contexts_title <", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleLessThanOrEqualTo(String value) {
            addCriterion("contexts_title <=", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleLike(String value) {
            addCriterion("contexts_title like", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleNotLike(String value) {
            addCriterion("contexts_title not like", value, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleIn(List<String> values) {
            addCriterion("contexts_title in", values, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleNotIn(List<String> values) {
            addCriterion("contexts_title not in", values, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleBetween(String value1, String value2) {
            addCriterion("contexts_title between", value1, value2, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andContextsTitleNotBetween(String value1, String value2) {
            addCriterion("contexts_title not between", value1, value2, "contextsTitle");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdIsNull() {
            addCriterion("contexts_class_id is null");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdIsNotNull() {
            addCriterion("contexts_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdEqualTo(Integer value) {
            addCriterion("contexts_class_id =", value, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdNotEqualTo(Integer value) {
            addCriterion("contexts_class_id <>", value, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdGreaterThan(Integer value) {
            addCriterion("contexts_class_id >", value, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contexts_class_id >=", value, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdLessThan(Integer value) {
            addCriterion("contexts_class_id <", value, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("contexts_class_id <=", value, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdIn(List<Integer> values) {
            addCriterion("contexts_class_id in", values, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdNotIn(List<Integer> values) {
            addCriterion("contexts_class_id not in", values, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdBetween(Integer value1, Integer value2) {
            addCriterion("contexts_class_id between", value1, value2, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contexts_class_id not between", value1, value2, "contextsClassId");
            return (Criteria) this;
        }

        public Criteria andContextsupdateIsNull() {
            addCriterion("contextsUpdate is null");
            return (Criteria) this;
        }

        public Criteria andContextsupdateIsNotNull() {
            addCriterion("contextsUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andContextsupdateEqualTo(Date value) {
            addCriterion("contextsUpdate =", value, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateNotEqualTo(Date value) {
            addCriterion("contextsUpdate <>", value, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateGreaterThan(Date value) {
            addCriterion("contextsUpdate >", value, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("contextsUpdate >=", value, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateLessThan(Date value) {
            addCriterion("contextsUpdate <", value, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateLessThanOrEqualTo(Date value) {
            addCriterion("contextsUpdate <=", value, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateIn(List<Date> values) {
            addCriterion("contextsUpdate in", values, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateNotIn(List<Date> values) {
            addCriterion("contextsUpdate not in", values, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateBetween(Date value1, Date value2) {
            addCriterion("contextsUpdate between", value1, value2, "contextsupdate");
            return (Criteria) this;
        }

        public Criteria andContextsupdateNotBetween(Date value1, Date value2) {
            addCriterion("contextsUpdate not between", value1, value2, "contextsupdate");
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