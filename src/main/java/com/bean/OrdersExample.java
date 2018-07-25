package com.bean;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andONameIsNull() {
            addCriterion("o_name is null");
            return (Criteria) this;
        }

        public Criteria andONameIsNotNull() {
            addCriterion("o_name is not null");
            return (Criteria) this;
        }

        public Criteria andONameEqualTo(String value) {
            addCriterion("o_name =", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotEqualTo(String value) {
            addCriterion("o_name <>", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThan(String value) {
            addCriterion("o_name >", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThanOrEqualTo(String value) {
            addCriterion("o_name >=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThan(String value) {
            addCriterion("o_name <", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThanOrEqualTo(String value) {
            addCriterion("o_name <=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLike(String value) {
            addCriterion("o_name like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotLike(String value) {
            addCriterion("o_name not like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameIn(List<String> values) {
            addCriterion("o_name in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotIn(List<String> values) {
            addCriterion("o_name not in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameBetween(String value1, String value2) {
            addCriterion("o_name between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotBetween(String value1, String value2) {
            addCriterion("o_name not between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoIsNull() {
            addCriterion("o_goodsinfo is null");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoIsNotNull() {
            addCriterion("o_goodsinfo is not null");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoEqualTo(String value) {
            addCriterion("o_goodsinfo =", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoNotEqualTo(String value) {
            addCriterion("o_goodsinfo <>", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoGreaterThan(String value) {
            addCriterion("o_goodsinfo >", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoGreaterThanOrEqualTo(String value) {
            addCriterion("o_goodsinfo >=", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoLessThan(String value) {
            addCriterion("o_goodsinfo <", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoLessThanOrEqualTo(String value) {
            addCriterion("o_goodsinfo <=", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoLike(String value) {
            addCriterion("o_goodsinfo like", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoNotLike(String value) {
            addCriterion("o_goodsinfo not like", value, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoIn(List<String> values) {
            addCriterion("o_goodsinfo in", values, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoNotIn(List<String> values) {
            addCriterion("o_goodsinfo not in", values, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoBetween(String value1, String value2) {
            addCriterion("o_goodsinfo between", value1, value2, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOGoodsinfoNotBetween(String value1, String value2) {
            addCriterion("o_goodsinfo not between", value1, value2, "oGoodsinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoIsNull() {
            addCriterion("o_memberinfo is null");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoIsNotNull() {
            addCriterion("o_memberinfo is not null");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoEqualTo(String value) {
            addCriterion("o_memberinfo =", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoNotEqualTo(String value) {
            addCriterion("o_memberinfo <>", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoGreaterThan(String value) {
            addCriterion("o_memberinfo >", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoGreaterThanOrEqualTo(String value) {
            addCriterion("o_memberinfo >=", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoLessThan(String value) {
            addCriterion("o_memberinfo <", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoLessThanOrEqualTo(String value) {
            addCriterion("o_memberinfo <=", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoLike(String value) {
            addCriterion("o_memberinfo like", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoNotLike(String value) {
            addCriterion("o_memberinfo not like", value, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoIn(List<String> values) {
            addCriterion("o_memberinfo in", values, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoNotIn(List<String> values) {
            addCriterion("o_memberinfo not in", values, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoBetween(String value1, String value2) {
            addCriterion("o_memberinfo between", value1, value2, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andOMemberinfoNotBetween(String value1, String value2) {
            addCriterion("o_memberinfo not between", value1, value2, "oMemberinfo");
            return (Criteria) this;
        }

        public Criteria andODataIsNull() {
            addCriterion("o_data is null");
            return (Criteria) this;
        }

        public Criteria andODataIsNotNull() {
            addCriterion("o_data is not null");
            return (Criteria) this;
        }

        public Criteria andODataEqualTo(String value) {
            addCriterion("o_data =", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataNotEqualTo(String value) {
            addCriterion("o_data <>", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataGreaterThan(String value) {
            addCriterion("o_data >", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataGreaterThanOrEqualTo(String value) {
            addCriterion("o_data >=", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataLessThan(String value) {
            addCriterion("o_data <", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataLessThanOrEqualTo(String value) {
            addCriterion("o_data <=", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataLike(String value) {
            addCriterion("o_data like", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataNotLike(String value) {
            addCriterion("o_data not like", value, "oData");
            return (Criteria) this;
        }

        public Criteria andODataIn(List<String> values) {
            addCriterion("o_data in", values, "oData");
            return (Criteria) this;
        }

        public Criteria andODataNotIn(List<String> values) {
            addCriterion("o_data not in", values, "oData");
            return (Criteria) this;
        }

        public Criteria andODataBetween(String value1, String value2) {
            addCriterion("o_data between", value1, value2, "oData");
            return (Criteria) this;
        }

        public Criteria andODataNotBetween(String value1, String value2) {
            addCriterion("o_data not between", value1, value2, "oData");
            return (Criteria) this;
        }

        public Criteria andOAddressIsNull() {
            addCriterion("o_address is null");
            return (Criteria) this;
        }

        public Criteria andOAddressIsNotNull() {
            addCriterion("o_address is not null");
            return (Criteria) this;
        }

        public Criteria andOAddressEqualTo(String value) {
            addCriterion("o_address =", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotEqualTo(String value) {
            addCriterion("o_address <>", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThan(String value) {
            addCriterion("o_address >", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThanOrEqualTo(String value) {
            addCriterion("o_address >=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThan(String value) {
            addCriterion("o_address <", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThanOrEqualTo(String value) {
            addCriterion("o_address <=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLike(String value) {
            addCriterion("o_address like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotLike(String value) {
            addCriterion("o_address not like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressIn(List<String> values) {
            addCriterion("o_address in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotIn(List<String> values) {
            addCriterion("o_address not in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressBetween(String value1, String value2) {
            addCriterion("o_address between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotBetween(String value1, String value2) {
            addCriterion("o_address not between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOReditIsNull() {
            addCriterion("o_redit is null");
            return (Criteria) this;
        }

        public Criteria andOReditIsNotNull() {
            addCriterion("o_redit is not null");
            return (Criteria) this;
        }

        public Criteria andOReditEqualTo(String value) {
            addCriterion("o_redit =", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditNotEqualTo(String value) {
            addCriterion("o_redit <>", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditGreaterThan(String value) {
            addCriterion("o_redit >", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditGreaterThanOrEqualTo(String value) {
            addCriterion("o_redit >=", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditLessThan(String value) {
            addCriterion("o_redit <", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditLessThanOrEqualTo(String value) {
            addCriterion("o_redit <=", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditLike(String value) {
            addCriterion("o_redit like", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditNotLike(String value) {
            addCriterion("o_redit not like", value, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditIn(List<String> values) {
            addCriterion("o_redit in", values, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditNotIn(List<String> values) {
            addCriterion("o_redit not in", values, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditBetween(String value1, String value2) {
            addCriterion("o_redit between", value1, value2, "oRedit");
            return (Criteria) this;
        }

        public Criteria andOReditNotBetween(String value1, String value2) {
            addCriterion("o_redit not between", value1, value2, "oRedit");
            return (Criteria) this;
        }

        public Criteria andODeleteIsNull() {
            addCriterion("o_delete is null");
            return (Criteria) this;
        }

        public Criteria andODeleteIsNotNull() {
            addCriterion("o_delete is not null");
            return (Criteria) this;
        }

        public Criteria andODeleteEqualTo(String value) {
            addCriterion("o_delete =", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteNotEqualTo(String value) {
            addCriterion("o_delete <>", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteGreaterThan(String value) {
            addCriterion("o_delete >", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteGreaterThanOrEqualTo(String value) {
            addCriterion("o_delete >=", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteLessThan(String value) {
            addCriterion("o_delete <", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteLessThanOrEqualTo(String value) {
            addCriterion("o_delete <=", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteLike(String value) {
            addCriterion("o_delete like", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteNotLike(String value) {
            addCriterion("o_delete not like", value, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteIn(List<String> values) {
            addCriterion("o_delete in", values, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteNotIn(List<String> values) {
            addCriterion("o_delete not in", values, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteBetween(String value1, String value2) {
            addCriterion("o_delete between", value1, value2, "oDelete");
            return (Criteria) this;
        }

        public Criteria andODeleteNotBetween(String value1, String value2) {
            addCriterion("o_delete not between", value1, value2, "oDelete");
            return (Criteria) this;
        }

        public Criteria andOAddIsNull() {
            addCriterion("o_add is null");
            return (Criteria) this;
        }

        public Criteria andOAddIsNotNull() {
            addCriterion("o_add is not null");
            return (Criteria) this;
        }

        public Criteria andOAddEqualTo(String value) {
            addCriterion("o_add =", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddNotEqualTo(String value) {
            addCriterion("o_add <>", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddGreaterThan(String value) {
            addCriterion("o_add >", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddGreaterThanOrEqualTo(String value) {
            addCriterion("o_add >=", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddLessThan(String value) {
            addCriterion("o_add <", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddLessThanOrEqualTo(String value) {
            addCriterion("o_add <=", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddLike(String value) {
            addCriterion("o_add like", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddNotLike(String value) {
            addCriterion("o_add not like", value, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddIn(List<String> values) {
            addCriterion("o_add in", values, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddNotIn(List<String> values) {
            addCriterion("o_add not in", values, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddBetween(String value1, String value2) {
            addCriterion("o_add between", value1, value2, "oAdd");
            return (Criteria) this;
        }

        public Criteria andOAddNotBetween(String value1, String value2) {
            addCriterion("o_add not between", value1, value2, "oAdd");
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