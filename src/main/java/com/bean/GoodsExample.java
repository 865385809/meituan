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

        public Criteria andGodIdIsNull() {
            addCriterion("god_id is null");
            return (Criteria) this;
        }

        public Criteria andGodIdIsNotNull() {
            addCriterion("god_id is not null");
            return (Criteria) this;
        }

        public Criteria andGodIdEqualTo(Integer value) {
            addCriterion("god_id =", value, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdNotEqualTo(Integer value) {
            addCriterion("god_id <>", value, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdGreaterThan(Integer value) {
            addCriterion("god_id >", value, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("god_id >=", value, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdLessThan(Integer value) {
            addCriterion("god_id <", value, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdLessThanOrEqualTo(Integer value) {
            addCriterion("god_id <=", value, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdIn(List<Integer> values) {
            addCriterion("god_id in", values, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdNotIn(List<Integer> values) {
            addCriterion("god_id not in", values, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdBetween(Integer value1, Integer value2) {
            addCriterion("god_id between", value1, value2, "godId");
            return (Criteria) this;
        }

        public Criteria andGodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("god_id not between", value1, value2, "godId");
            return (Criteria) this;
        }

        public Criteria andGodNameIsNull() {
            addCriterion("god_name is null");
            return (Criteria) this;
        }

        public Criteria andGodNameIsNotNull() {
            addCriterion("god_name is not null");
            return (Criteria) this;
        }

        public Criteria andGodNameEqualTo(String value) {
            addCriterion("god_name =", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameNotEqualTo(String value) {
            addCriterion("god_name <>", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameGreaterThan(String value) {
            addCriterion("god_name >", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameGreaterThanOrEqualTo(String value) {
            addCriterion("god_name >=", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameLessThan(String value) {
            addCriterion("god_name <", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameLessThanOrEqualTo(String value) {
            addCriterion("god_name <=", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameLike(String value) {
            addCriterion("god_name like", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameNotLike(String value) {
            addCriterion("god_name not like", value, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameIn(List<String> values) {
            addCriterion("god_name in", values, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameNotIn(List<String> values) {
            addCriterion("god_name not in", values, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameBetween(String value1, String value2) {
            addCriterion("god_name between", value1, value2, "godName");
            return (Criteria) this;
        }

        public Criteria andGodNameNotBetween(String value1, String value2) {
            addCriterion("god_name not between", value1, value2, "godName");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceIsNull() {
            addCriterion("god_storeprice is null");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceIsNotNull() {
            addCriterion("god_storeprice is not null");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceEqualTo(Double value) {
            addCriterion("god_storeprice =", value, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceNotEqualTo(Double value) {
            addCriterion("god_storeprice <>", value, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceGreaterThan(Double value) {
            addCriterion("god_storeprice >", value, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("god_storeprice >=", value, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceLessThan(Double value) {
            addCriterion("god_storeprice <", value, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceLessThanOrEqualTo(Double value) {
            addCriterion("god_storeprice <=", value, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceIn(List<Double> values) {
            addCriterion("god_storeprice in", values, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceNotIn(List<Double> values) {
            addCriterion("god_storeprice not in", values, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceBetween(Double value1, Double value2) {
            addCriterion("god_storeprice between", value1, value2, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodStorepriceNotBetween(Double value1, Double value2) {
            addCriterion("god_storeprice not between", value1, value2, "godStoreprice");
            return (Criteria) this;
        }

        public Criteria andGodNumberIsNull() {
            addCriterion("god_number is null");
            return (Criteria) this;
        }

        public Criteria andGodNumberIsNotNull() {
            addCriterion("god_number is not null");
            return (Criteria) this;
        }

        public Criteria andGodNumberEqualTo(Integer value) {
            addCriterion("god_number =", value, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberNotEqualTo(Integer value) {
            addCriterion("god_number <>", value, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberGreaterThan(Integer value) {
            addCriterion("god_number >", value, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("god_number >=", value, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberLessThan(Integer value) {
            addCriterion("god_number <", value, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberLessThanOrEqualTo(Integer value) {
            addCriterion("god_number <=", value, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberIn(List<Integer> values) {
            addCriterion("god_number in", values, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberNotIn(List<Integer> values) {
            addCriterion("god_number not in", values, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberBetween(Integer value1, Integer value2) {
            addCriterion("god_number between", value1, value2, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("god_number not between", value1, value2, "godNumber");
            return (Criteria) this;
        }

        public Criteria andGodPriceIsNull() {
            addCriterion("god_price is null");
            return (Criteria) this;
        }

        public Criteria andGodPriceIsNotNull() {
            addCriterion("god_price is not null");
            return (Criteria) this;
        }

        public Criteria andGodPriceEqualTo(Double value) {
            addCriterion("god_price =", value, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceNotEqualTo(Double value) {
            addCriterion("god_price <>", value, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceGreaterThan(Double value) {
            addCriterion("god_price >", value, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("god_price >=", value, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceLessThan(Double value) {
            addCriterion("god_price <", value, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceLessThanOrEqualTo(Double value) {
            addCriterion("god_price <=", value, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceIn(List<Double> values) {
            addCriterion("god_price in", values, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceNotIn(List<Double> values) {
            addCriterion("god_price not in", values, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceBetween(Double value1, Double value2) {
            addCriterion("god_price between", value1, value2, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPriceNotBetween(Double value1, Double value2) {
            addCriterion("god_price not between", value1, value2, "godPrice");
            return (Criteria) this;
        }

        public Criteria andGodPictureIsNull() {
            addCriterion("god_picture is null");
            return (Criteria) this;
        }

        public Criteria andGodPictureIsNotNull() {
            addCriterion("god_picture is not null");
            return (Criteria) this;
        }

        public Criteria andGodPictureEqualTo(String value) {
            addCriterion("god_picture =", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureNotEqualTo(String value) {
            addCriterion("god_picture <>", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureGreaterThan(String value) {
            addCriterion("god_picture >", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureGreaterThanOrEqualTo(String value) {
            addCriterion("god_picture >=", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureLessThan(String value) {
            addCriterion("god_picture <", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureLessThanOrEqualTo(String value) {
            addCriterion("god_picture <=", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureLike(String value) {
            addCriterion("god_picture like", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureNotLike(String value) {
            addCriterion("god_picture not like", value, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureIn(List<String> values) {
            addCriterion("god_picture in", values, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureNotIn(List<String> values) {
            addCriterion("god_picture not in", values, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureBetween(String value1, String value2) {
            addCriterion("god_picture between", value1, value2, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodPictureNotBetween(String value1, String value2) {
            addCriterion("god_picture not between", value1, value2, "godPicture");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionIsNull() {
            addCriterion("god_description is null");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionIsNotNull() {
            addCriterion("god_description is not null");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionEqualTo(String value) {
            addCriterion("god_description =", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionNotEqualTo(String value) {
            addCriterion("god_description <>", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionGreaterThan(String value) {
            addCriterion("god_description >", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("god_description >=", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionLessThan(String value) {
            addCriterion("god_description <", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionLessThanOrEqualTo(String value) {
            addCriterion("god_description <=", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionLike(String value) {
            addCriterion("god_description like", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionNotLike(String value) {
            addCriterion("god_description not like", value, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionIn(List<String> values) {
            addCriterion("god_description in", values, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionNotIn(List<String> values) {
            addCriterion("god_description not in", values, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionBetween(String value1, String value2) {
            addCriterion("god_description between", value1, value2, "godDescription");
            return (Criteria) this;
        }

        public Criteria andGodDescriptionNotBetween(String value1, String value2) {
            addCriterion("god_description not between", value1, value2, "godDescription");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
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