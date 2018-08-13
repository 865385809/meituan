package com.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComContextIsNull() {
            addCriterion("com_context is null");
            return (Criteria) this;
        }

        public Criteria andComContextIsNotNull() {
            addCriterion("com_context is not null");
            return (Criteria) this;
        }

        public Criteria andComContextEqualTo(String value) {
            addCriterion("com_context =", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextNotEqualTo(String value) {
            addCriterion("com_context <>", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextGreaterThan(String value) {
            addCriterion("com_context >", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextGreaterThanOrEqualTo(String value) {
            addCriterion("com_context >=", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextLessThan(String value) {
            addCriterion("com_context <", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextLessThanOrEqualTo(String value) {
            addCriterion("com_context <=", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextLike(String value) {
            addCriterion("com_context like", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextNotLike(String value) {
            addCriterion("com_context not like", value, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextIn(List<String> values) {
            addCriterion("com_context in", values, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextNotIn(List<String> values) {
            addCriterion("com_context not in", values, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextBetween(String value1, String value2) {
            addCriterion("com_context between", value1, value2, "comContext");
            return (Criteria) this;
        }

        public Criteria andComContextNotBetween(String value1, String value2) {
            addCriterion("com_context not between", value1, value2, "comContext");
            return (Criteria) this;
        }

        public Criteria andComTitleIsNull() {
            addCriterion("com_title is null");
            return (Criteria) this;
        }

        public Criteria andComTitleIsNotNull() {
            addCriterion("com_title is not null");
            return (Criteria) this;
        }

        public Criteria andComTitleEqualTo(String value) {
            addCriterion("com_title =", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotEqualTo(String value) {
            addCriterion("com_title <>", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleGreaterThan(String value) {
            addCriterion("com_title >", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleGreaterThanOrEqualTo(String value) {
            addCriterion("com_title >=", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleLessThan(String value) {
            addCriterion("com_title <", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleLessThanOrEqualTo(String value) {
            addCriterion("com_title <=", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleLike(String value) {
            addCriterion("com_title like", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotLike(String value) {
            addCriterion("com_title not like", value, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleIn(List<String> values) {
            addCriterion("com_title in", values, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotIn(List<String> values) {
            addCriterion("com_title not in", values, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleBetween(String value1, String value2) {
            addCriterion("com_title between", value1, value2, "comTitle");
            return (Criteria) this;
        }

        public Criteria andComTitleNotBetween(String value1, String value2) {
            addCriterion("com_title not between", value1, value2, "comTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andComPictureIsNull() {
            addCriterion("com_picture is null");
            return (Criteria) this;
        }

        public Criteria andComPictureIsNotNull() {
            addCriterion("com_picture is not null");
            return (Criteria) this;
        }

        public Criteria andComPictureEqualTo(String value) {
            addCriterion("com_picture =", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureNotEqualTo(String value) {
            addCriterion("com_picture <>", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureGreaterThan(String value) {
            addCriterion("com_picture >", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureGreaterThanOrEqualTo(String value) {
            addCriterion("com_picture >=", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureLessThan(String value) {
            addCriterion("com_picture <", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureLessThanOrEqualTo(String value) {
            addCriterion("com_picture <=", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureLike(String value) {
            addCriterion("com_picture like", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureNotLike(String value) {
            addCriterion("com_picture not like", value, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureIn(List<String> values) {
            addCriterion("com_picture in", values, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureNotIn(List<String> values) {
            addCriterion("com_picture not in", values, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureBetween(String value1, String value2) {
            addCriterion("com_picture between", value1, value2, "comPicture");
            return (Criteria) this;
        }

        public Criteria andComPictureNotBetween(String value1, String value2) {
            addCriterion("com_picture not between", value1, value2, "comPicture");
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