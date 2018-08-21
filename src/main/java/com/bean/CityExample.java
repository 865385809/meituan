package com.bean;

import java.util.ArrayList;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
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

        public Criteria andCiIdIsNull() {
            addCriterion("ci_id is null");
            return (Criteria) this;
        }

        public Criteria andCiIdIsNotNull() {
            addCriterion("ci_id is not null");
            return (Criteria) this;
        }

        public Criteria andCiIdEqualTo(Integer value) {
            addCriterion("ci_id =", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdNotEqualTo(Integer value) {
            addCriterion("ci_id <>", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdGreaterThan(Integer value) {
            addCriterion("ci_id >", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ci_id >=", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdLessThan(Integer value) {
            addCriterion("ci_id <", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ci_id <=", value, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdIn(List<Integer> values) {
            addCriterion("ci_id in", values, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdNotIn(List<Integer> values) {
            addCriterion("ci_id not in", values, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdBetween(Integer value1, Integer value2) {
            addCriterion("ci_id between", value1, value2, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ci_id not between", value1, value2, "ciId");
            return (Criteria) this;
        }

        public Criteria andCiNumberIsNull() {
            addCriterion("ci_number is null");
            return (Criteria) this;
        }

        public Criteria andCiNumberIsNotNull() {
            addCriterion("ci_number is not null");
            return (Criteria) this;
        }

        public Criteria andCiNumberEqualTo(String value) {
            addCriterion("ci_number =", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberNotEqualTo(String value) {
            addCriterion("ci_number <>", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberGreaterThan(String value) {
            addCriterion("ci_number >", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ci_number >=", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberLessThan(String value) {
            addCriterion("ci_number <", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberLessThanOrEqualTo(String value) {
            addCriterion("ci_number <=", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberLike(String value) {
            addCriterion("ci_number like", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberNotLike(String value) {
            addCriterion("ci_number not like", value, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberIn(List<String> values) {
            addCriterion("ci_number in", values, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberNotIn(List<String> values) {
            addCriterion("ci_number not in", values, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberBetween(String value1, String value2) {
            addCriterion("ci_number between", value1, value2, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNumberNotBetween(String value1, String value2) {
            addCriterion("ci_number not between", value1, value2, "ciNumber");
            return (Criteria) this;
        }

        public Criteria andCiNameIsNull() {
            addCriterion("ci_name is null");
            return (Criteria) this;
        }

        public Criteria andCiNameIsNotNull() {
            addCriterion("ci_name is not null");
            return (Criteria) this;
        }

        public Criteria andCiNameEqualTo(String value) {
            addCriterion("ci_name =", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameNotEqualTo(String value) {
            addCriterion("ci_name <>", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameGreaterThan(String value) {
            addCriterion("ci_name >", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ci_name >=", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameLessThan(String value) {
            addCriterion("ci_name <", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameLessThanOrEqualTo(String value) {
            addCriterion("ci_name <=", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameLike(String value) {
            addCriterion("ci_name like", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameNotLike(String value) {
            addCriterion("ci_name not like", value, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameIn(List<String> values) {
            addCriterion("ci_name in", values, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameNotIn(List<String> values) {
            addCriterion("ci_name not in", values, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameBetween(String value1, String value2) {
            addCriterion("ci_name between", value1, value2, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiNameNotBetween(String value1, String value2) {
            addCriterion("ci_name not between", value1, value2, "ciName");
            return (Criteria) this;
        }

        public Criteria andCiBelongIsNull() {
            addCriterion("ci_belong is null");
            return (Criteria) this;
        }

        public Criteria andCiBelongIsNotNull() {
            addCriterion("ci_belong is not null");
            return (Criteria) this;
        }

        public Criteria andCiBelongEqualTo(String value) {
            addCriterion("ci_belong =", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongNotEqualTo(String value) {
            addCriterion("ci_belong <>", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongGreaterThan(String value) {
            addCriterion("ci_belong >", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongGreaterThanOrEqualTo(String value) {
            addCriterion("ci_belong >=", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongLessThan(String value) {
            addCriterion("ci_belong <", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongLessThanOrEqualTo(String value) {
            addCriterion("ci_belong <=", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongLike(String value) {
            addCriterion("ci_belong like", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongNotLike(String value) {
            addCriterion("ci_belong not like", value, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongIn(List<String> values) {
            addCriterion("ci_belong in", values, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongNotIn(List<String> values) {
            addCriterion("ci_belong not in", values, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongBetween(String value1, String value2) {
            addCriterion("ci_belong between", value1, value2, "ciBelong");
            return (Criteria) this;
        }

        public Criteria andCiBelongNotBetween(String value1, String value2) {
            addCriterion("ci_belong not between", value1, value2, "ciBelong");
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