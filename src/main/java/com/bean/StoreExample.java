package com.bean;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStoIdIsNull() {
            addCriterion("sto_id is null");
            return (Criteria) this;
        }

        public Criteria andStoIdIsNotNull() {
            addCriterion("sto_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoIdEqualTo(Integer value) {
            addCriterion("sto_id =", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualTo(Integer value) {
            addCriterion("sto_id <>", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThan(Integer value) {
            addCriterion("sto_id >", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sto_id >=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThan(Integer value) {
            addCriterion("sto_id <", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualTo(Integer value) {
            addCriterion("sto_id <=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdIn(List<Integer> values) {
            addCriterion("sto_id in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotIn(List<Integer> values) {
            addCriterion("sto_id not in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdBetween(Integer value1, Integer value2) {
            addCriterion("sto_id between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sto_id not between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoNameIsNull() {
            addCriterion("sto_name is null");
            return (Criteria) this;
        }

        public Criteria andStoNameIsNotNull() {
            addCriterion("sto_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoNameEqualTo(String value) {
            addCriterion("sto_name =", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameNotEqualTo(String value) {
            addCriterion("sto_name <>", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameGreaterThan(String value) {
            addCriterion("sto_name >", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameGreaterThanOrEqualTo(String value) {
            addCriterion("sto_name >=", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameLessThan(String value) {
            addCriterion("sto_name <", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameLessThanOrEqualTo(String value) {
            addCriterion("sto_name <=", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameLike(String value) {
            addCriterion("sto_name like", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameNotLike(String value) {
            addCriterion("sto_name not like", value, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameIn(List<String> values) {
            addCriterion("sto_name in", values, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameNotIn(List<String> values) {
            addCriterion("sto_name not in", values, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameBetween(String value1, String value2) {
            addCriterion("sto_name between", value1, value2, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoNameNotBetween(String value1, String value2) {
            addCriterion("sto_name not between", value1, value2, "stoName");
            return (Criteria) this;
        }

        public Criteria andStoTypeIsNull() {
            addCriterion("sto_type is null");
            return (Criteria) this;
        }

        public Criteria andStoTypeIsNotNull() {
            addCriterion("sto_type is not null");
            return (Criteria) this;
        }

        public Criteria andStoTypeEqualTo(String value) {
            addCriterion("sto_type =", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeNotEqualTo(String value) {
            addCriterion("sto_type <>", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeGreaterThan(String value) {
            addCriterion("sto_type >", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sto_type >=", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeLessThan(String value) {
            addCriterion("sto_type <", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeLessThanOrEqualTo(String value) {
            addCriterion("sto_type <=", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeLike(String value) {
            addCriterion("sto_type like", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeNotLike(String value) {
            addCriterion("sto_type not like", value, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeIn(List<String> values) {
            addCriterion("sto_type in", values, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeNotIn(List<String> values) {
            addCriterion("sto_type not in", values, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeBetween(String value1, String value2) {
            addCriterion("sto_type between", value1, value2, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoTypeNotBetween(String value1, String value2) {
            addCriterion("sto_type not between", value1, value2, "stoType");
            return (Criteria) this;
        }

        public Criteria andStoCityIsNull() {
            addCriterion("sto_city is null");
            return (Criteria) this;
        }

        public Criteria andStoCityIsNotNull() {
            addCriterion("sto_city is not null");
            return (Criteria) this;
        }

        public Criteria andStoCityEqualTo(String value) {
            addCriterion("sto_city =", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityNotEqualTo(String value) {
            addCriterion("sto_city <>", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityGreaterThan(String value) {
            addCriterion("sto_city >", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityGreaterThanOrEqualTo(String value) {
            addCriterion("sto_city >=", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityLessThan(String value) {
            addCriterion("sto_city <", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityLessThanOrEqualTo(String value) {
            addCriterion("sto_city <=", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityLike(String value) {
            addCriterion("sto_city like", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityNotLike(String value) {
            addCriterion("sto_city not like", value, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityIn(List<String> values) {
            addCriterion("sto_city in", values, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityNotIn(List<String> values) {
            addCriterion("sto_city not in", values, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityBetween(String value1, String value2) {
            addCriterion("sto_city between", value1, value2, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoCityNotBetween(String value1, String value2) {
            addCriterion("sto_city not between", value1, value2, "stoCity");
            return (Criteria) this;
        }

        public Criteria andStoClassifyIsNull() {
            addCriterion("sto_classify is null");
            return (Criteria) this;
        }

        public Criteria andStoClassifyIsNotNull() {
            addCriterion("sto_classify is not null");
            return (Criteria) this;
        }

        public Criteria andStoClassifyEqualTo(String value) {
            addCriterion("sto_classify =", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyNotEqualTo(String value) {
            addCriterion("sto_classify <>", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyGreaterThan(String value) {
            addCriterion("sto_classify >", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("sto_classify >=", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyLessThan(String value) {
            addCriterion("sto_classify <", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyLessThanOrEqualTo(String value) {
            addCriterion("sto_classify <=", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyLike(String value) {
            addCriterion("sto_classify like", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyNotLike(String value) {
            addCriterion("sto_classify not like", value, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyIn(List<String> values) {
            addCriterion("sto_classify in", values, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyNotIn(List<String> values) {
            addCriterion("sto_classify not in", values, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyBetween(String value1, String value2) {
            addCriterion("sto_classify between", value1, value2, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoClassifyNotBetween(String value1, String value2) {
            addCriterion("sto_classify not between", value1, value2, "stoClassify");
            return (Criteria) this;
        }

        public Criteria andStoAddressIsNull() {
            addCriterion("sto_address is null");
            return (Criteria) this;
        }

        public Criteria andStoAddressIsNotNull() {
            addCriterion("sto_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoAddressEqualTo(String value) {
            addCriterion("sto_address =", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressNotEqualTo(String value) {
            addCriterion("sto_address <>", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressGreaterThan(String value) {
            addCriterion("sto_address >", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sto_address >=", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressLessThan(String value) {
            addCriterion("sto_address <", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressLessThanOrEqualTo(String value) {
            addCriterion("sto_address <=", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressLike(String value) {
            addCriterion("sto_address like", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressNotLike(String value) {
            addCriterion("sto_address not like", value, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressIn(List<String> values) {
            addCriterion("sto_address in", values, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressNotIn(List<String> values) {
            addCriterion("sto_address not in", values, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressBetween(String value1, String value2) {
            addCriterion("sto_address between", value1, value2, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoAddressNotBetween(String value1, String value2) {
            addCriterion("sto_address not between", value1, value2, "stoAddress");
            return (Criteria) this;
        }

        public Criteria andStoPriceIsNull() {
            addCriterion("sto_price is null");
            return (Criteria) this;
        }

        public Criteria andStoPriceIsNotNull() {
            addCriterion("sto_price is not null");
            return (Criteria) this;
        }

        public Criteria andStoPriceEqualTo(Double value) {
            addCriterion("sto_price =", value, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceNotEqualTo(Double value) {
            addCriterion("sto_price <>", value, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceGreaterThan(Double value) {
            addCriterion("sto_price >", value, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sto_price >=", value, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceLessThan(Double value) {
            addCriterion("sto_price <", value, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceLessThanOrEqualTo(Double value) {
            addCriterion("sto_price <=", value, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceIn(List<Double> values) {
            addCriterion("sto_price in", values, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceNotIn(List<Double> values) {
            addCriterion("sto_price not in", values, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceBetween(Double value1, Double value2) {
            addCriterion("sto_price between", value1, value2, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPriceNotBetween(Double value1, Double value2) {
            addCriterion("sto_price not between", value1, value2, "stoPrice");
            return (Criteria) this;
        }

        public Criteria andStoPictureIsNull() {
            addCriterion("sto_picture is null");
            return (Criteria) this;
        }

        public Criteria andStoPictureIsNotNull() {
            addCriterion("sto_picture is not null");
            return (Criteria) this;
        }

        public Criteria andStoPictureEqualTo(String value) {
            addCriterion("sto_picture =", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureNotEqualTo(String value) {
            addCriterion("sto_picture <>", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureGreaterThan(String value) {
            addCriterion("sto_picture >", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureGreaterThanOrEqualTo(String value) {
            addCriterion("sto_picture >=", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureLessThan(String value) {
            addCriterion("sto_picture <", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureLessThanOrEqualTo(String value) {
            addCriterion("sto_picture <=", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureLike(String value) {
            addCriterion("sto_picture like", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureNotLike(String value) {
            addCriterion("sto_picture not like", value, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureIn(List<String> values) {
            addCriterion("sto_picture in", values, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureNotIn(List<String> values) {
            addCriterion("sto_picture not in", values, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureBetween(String value1, String value2) {
            addCriterion("sto_picture between", value1, value2, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoPictureNotBetween(String value1, String value2) {
            addCriterion("sto_picture not between", value1, value2, "stoPicture");
            return (Criteria) this;
        }

        public Criteria andStoTelIsNull() {
            addCriterion("sto_tel is null");
            return (Criteria) this;
        }

        public Criteria andStoTelIsNotNull() {
            addCriterion("sto_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStoTelEqualTo(String value) {
            addCriterion("sto_tel =", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelNotEqualTo(String value) {
            addCriterion("sto_tel <>", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelGreaterThan(String value) {
            addCriterion("sto_tel >", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelGreaterThanOrEqualTo(String value) {
            addCriterion("sto_tel >=", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelLessThan(String value) {
            addCriterion("sto_tel <", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelLessThanOrEqualTo(String value) {
            addCriterion("sto_tel <=", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelLike(String value) {
            addCriterion("sto_tel like", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelNotLike(String value) {
            addCriterion("sto_tel not like", value, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelIn(List<String> values) {
            addCriterion("sto_tel in", values, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelNotIn(List<String> values) {
            addCriterion("sto_tel not in", values, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelBetween(String value1, String value2) {
            addCriterion("sto_tel between", value1, value2, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTelNotBetween(String value1, String value2) {
            addCriterion("sto_tel not between", value1, value2, "stoTel");
            return (Criteria) this;
        }

        public Criteria andStoTimeIsNull() {
            addCriterion("sto_time is null");
            return (Criteria) this;
        }

        public Criteria andStoTimeIsNotNull() {
            addCriterion("sto_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoTimeEqualTo(String value) {
            addCriterion("sto_time =", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeNotEqualTo(String value) {
            addCriterion("sto_time <>", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeGreaterThan(String value) {
            addCriterion("sto_time >", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sto_time >=", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeLessThan(String value) {
            addCriterion("sto_time <", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeLessThanOrEqualTo(String value) {
            addCriterion("sto_time <=", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeLike(String value) {
            addCriterion("sto_time like", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeNotLike(String value) {
            addCriterion("sto_time not like", value, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeIn(List<String> values) {
            addCriterion("sto_time in", values, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeNotIn(List<String> values) {
            addCriterion("sto_time not in", values, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeBetween(String value1, String value2) {
            addCriterion("sto_time between", value1, value2, "stoTime");
            return (Criteria) this;
        }

        public Criteria andStoTimeNotBetween(String value1, String value2) {
            addCriterion("sto_time not between", value1, value2, "stoTime");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
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