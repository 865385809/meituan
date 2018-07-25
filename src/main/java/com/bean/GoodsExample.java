package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("g_name =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("g_name >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("g_name <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("g_name like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("g_name not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("g_name in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGSpriceIsNull() {
            addCriterion("g_sprice is null");
            return (Criteria) this;
        }

        public Criteria andGSpriceIsNotNull() {
            addCriterion("g_sprice is not null");
            return (Criteria) this;
        }

        public Criteria andGSpriceEqualTo(Double value) {
            addCriterion("g_sprice =", value, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceNotEqualTo(Double value) {
            addCriterion("g_sprice <>", value, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceGreaterThan(Double value) {
            addCriterion("g_sprice >", value, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("g_sprice >=", value, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceLessThan(Double value) {
            addCriterion("g_sprice <", value, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceLessThanOrEqualTo(Double value) {
            addCriterion("g_sprice <=", value, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceIn(List<Double> values) {
            addCriterion("g_sprice in", values, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceNotIn(List<Double> values) {
            addCriterion("g_sprice not in", values, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceBetween(Double value1, Double value2) {
            addCriterion("g_sprice between", value1, value2, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGSpriceNotBetween(Double value1, Double value2) {
            addCriterion("g_sprice not between", value1, value2, "gSprice");
            return (Criteria) this;
        }

        public Criteria andGNumberIsNull() {
            addCriterion("g_number is null");
            return (Criteria) this;
        }

        public Criteria andGNumberIsNotNull() {
            addCriterion("g_number is not null");
            return (Criteria) this;
        }

        public Criteria andGNumberEqualTo(Integer value) {
            addCriterion("g_number =", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberNotEqualTo(Integer value) {
            addCriterion("g_number <>", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberGreaterThan(Integer value) {
            addCriterion("g_number >", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_number >=", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberLessThan(Integer value) {
            addCriterion("g_number <", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberLessThanOrEqualTo(Integer value) {
            addCriterion("g_number <=", value, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberIn(List<Integer> values) {
            addCriterion("g_number in", values, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberNotIn(List<Integer> values) {
            addCriterion("g_number not in", values, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberBetween(Integer value1, Integer value2) {
            addCriterion("g_number between", value1, value2, "gNumber");
            return (Criteria) this;
        }

        public Criteria andGNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("g_number not between", value1, value2, "gNumber");
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