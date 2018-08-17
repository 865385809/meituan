package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOdrIdIsNull() {
            addCriterion("odr_id is null");
            return (Criteria) this;
        }

        public Criteria andOdrIdIsNotNull() {
            addCriterion("odr_id is not null");
            return (Criteria) this;
        }

        public Criteria andOdrIdEqualTo(Integer value) {
            addCriterion("odr_id =", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdNotEqualTo(Integer value) {
            addCriterion("odr_id <>", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdGreaterThan(Integer value) {
            addCriterion("odr_id >", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("odr_id >=", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdLessThan(Integer value) {
            addCriterion("odr_id <", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdLessThanOrEqualTo(Integer value) {
            addCriterion("odr_id <=", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdIn(List<Integer> values) {
            addCriterion("odr_id in", values, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdNotIn(List<Integer> values) {
            addCriterion("odr_id not in", values, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdBetween(Integer value1, Integer value2) {
            addCriterion("odr_id between", value1, value2, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("odr_id not between", value1, value2, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrNameIsNull() {
            addCriterion("odr_name is null");
            return (Criteria) this;
        }

        public Criteria andOdrNameIsNotNull() {
            addCriterion("odr_name is not null");
            return (Criteria) this;
        }

        public Criteria andOdrNameEqualTo(String value) {
            addCriterion("odr_name =", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameNotEqualTo(String value) {
            addCriterion("odr_name <>", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameGreaterThan(String value) {
            addCriterion("odr_name >", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameGreaterThanOrEqualTo(String value) {
            addCriterion("odr_name >=", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameLessThan(String value) {
            addCriterion("odr_name <", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameLessThanOrEqualTo(String value) {
            addCriterion("odr_name <=", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameLike(String value) {
            addCriterion("odr_name like", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameNotLike(String value) {
            addCriterion("odr_name not like", value, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameIn(List<String> values) {
            addCriterion("odr_name in", values, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameNotIn(List<String> values) {
            addCriterion("odr_name not in", values, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameBetween(String value1, String value2) {
            addCriterion("odr_name between", value1, value2, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrNameNotBetween(String value1, String value2) {
            addCriterion("odr_name not between", value1, value2, "odrName");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneIsNull() {
            addCriterion("odr_phone is null");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneIsNotNull() {
            addCriterion("odr_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneEqualTo(String value) {
            addCriterion("odr_phone =", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneNotEqualTo(String value) {
            addCriterion("odr_phone <>", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneGreaterThan(String value) {
            addCriterion("odr_phone >", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("odr_phone >=", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneLessThan(String value) {
            addCriterion("odr_phone <", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneLessThanOrEqualTo(String value) {
            addCriterion("odr_phone <=", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneLike(String value) {
            addCriterion("odr_phone like", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneNotLike(String value) {
            addCriterion("odr_phone not like", value, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneIn(List<String> values) {
            addCriterion("odr_phone in", values, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneNotIn(List<String> values) {
            addCriterion("odr_phone not in", values, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneBetween(String value1, String value2) {
            addCriterion("odr_phone between", value1, value2, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPhoneNotBetween(String value1, String value2) {
            addCriterion("odr_phone not between", value1, value2, "odrPhone");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateIsNull() {
            addCriterion("odr_paystate is null");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateIsNotNull() {
            addCriterion("odr_paystate is not null");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateEqualTo(String value) {
            addCriterion("odr_paystate =", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateNotEqualTo(String value) {
            addCriterion("odr_paystate <>", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateGreaterThan(String value) {
            addCriterion("odr_paystate >", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateGreaterThanOrEqualTo(String value) {
            addCriterion("odr_paystate >=", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateLessThan(String value) {
            addCriterion("odr_paystate <", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateLessThanOrEqualTo(String value) {
            addCriterion("odr_paystate <=", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateLike(String value) {
            addCriterion("odr_paystate like", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateNotLike(String value) {
            addCriterion("odr_paystate not like", value, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateIn(List<String> values) {
            addCriterion("odr_paystate in", values, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateNotIn(List<String> values) {
            addCriterion("odr_paystate not in", values, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateBetween(String value1, String value2) {
            addCriterion("odr_paystate between", value1, value2, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrPaystateNotBetween(String value1, String value2) {
            addCriterion("odr_paystate not between", value1, value2, "odrPaystate");
            return (Criteria) this;
        }

        public Criteria andOdrDataIsNull() {
            addCriterion("odr_data is null");
            return (Criteria) this;
        }

        public Criteria andOdrDataIsNotNull() {
            addCriterion("odr_data is not null");
            return (Criteria) this;
        }

        public Criteria andOdrDataEqualTo(Date value) {
            addCriterionForJDBCDate("odr_data =", value, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("odr_data <>", value, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataGreaterThan(Date value) {
            addCriterionForJDBCDate("odr_data >", value, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("odr_data >=", value, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataLessThan(Date value) {
            addCriterionForJDBCDate("odr_data <", value, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("odr_data <=", value, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataIn(List<Date> values) {
            addCriterionForJDBCDate("odr_data in", values, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("odr_data not in", values, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("odr_data between", value1, value2, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("odr_data not between", value1, value2, "odrData");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateIsNull() {
            addCriterion("odr_userstate is null");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateIsNotNull() {
            addCriterion("odr_userstate is not null");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateEqualTo(String value) {
            addCriterion("odr_userstate =", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateNotEqualTo(String value) {
            addCriterion("odr_userstate <>", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateGreaterThan(String value) {
            addCriterion("odr_userstate >", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateGreaterThanOrEqualTo(String value) {
            addCriterion("odr_userstate >=", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateLessThan(String value) {
            addCriterion("odr_userstate <", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateLessThanOrEqualTo(String value) {
            addCriterion("odr_userstate <=", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateLike(String value) {
            addCriterion("odr_userstate like", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateNotLike(String value) {
            addCriterion("odr_userstate not like", value, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateIn(List<String> values) {
            addCriterion("odr_userstate in", values, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateNotIn(List<String> values) {
            addCriterion("odr_userstate not in", values, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateBetween(String value1, String value2) {
            addCriterion("odr_userstate between", value1, value2, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrUserstateNotBetween(String value1, String value2) {
            addCriterion("odr_userstate not between", value1, value2, "odrUserstate");
            return (Criteria) this;
        }

        public Criteria andOdrPriceIsNull() {
            addCriterion("odr_price is null");
            return (Criteria) this;
        }

        public Criteria andOdrPriceIsNotNull() {
            addCriterion("odr_price is not null");
            return (Criteria) this;
        }

        public Criteria andOdrPriceEqualTo(Double value) {
            addCriterion("odr_price =", value, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceNotEqualTo(Double value) {
            addCriterion("odr_price <>", value, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceGreaterThan(Double value) {
            addCriterion("odr_price >", value, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("odr_price >=", value, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceLessThan(Double value) {
            addCriterion("odr_price <", value, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceLessThanOrEqualTo(Double value) {
            addCriterion("odr_price <=", value, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceIn(List<Double> values) {
            addCriterion("odr_price in", values, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceNotIn(List<Double> values) {
            addCriterion("odr_price not in", values, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceBetween(Double value1, Double value2) {
            addCriterion("odr_price between", value1, value2, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrPriceNotBetween(Double value1, Double value2) {
            addCriterion("odr_price not between", value1, value2, "odrPrice");
            return (Criteria) this;
        }

        public Criteria andOdrNumberIsNull() {
            addCriterion("odr_number is null");
            return (Criteria) this;
        }

        public Criteria andOdrNumberIsNotNull() {
            addCriterion("odr_number is not null");
            return (Criteria) this;
        }

        public Criteria andOdrNumberEqualTo(String value) {
            addCriterion("odr_number =", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberNotEqualTo(String value) {
            addCriterion("odr_number <>", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberGreaterThan(String value) {
            addCriterion("odr_number >", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberGreaterThanOrEqualTo(String value) {
            addCriterion("odr_number >=", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberLessThan(String value) {
            addCriterion("odr_number <", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberLessThanOrEqualTo(String value) {
            addCriterion("odr_number <=", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberLike(String value) {
            addCriterion("odr_number like", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberNotLike(String value) {
            addCriterion("odr_number not like", value, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberIn(List<String> values) {
            addCriterion("odr_number in", values, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberNotIn(List<String> values) {
            addCriterion("odr_number not in", values, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberBetween(String value1, String value2) {
            addCriterion("odr_number between", value1, value2, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andOdrNumberNotBetween(String value1, String value2) {
            addCriterion("odr_number not between", value1, value2, "odrNumber");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterionForJDBCDate("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterionForJDBCDate("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterionForJDBCDate("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andGodCountIsNull() {
            addCriterion("god_count is null");
            return (Criteria) this;
        }

        public Criteria andGodCountIsNotNull() {
            addCriterion("god_count is not null");
            return (Criteria) this;
        }

        public Criteria andGodCountEqualTo(String value) {
            addCriterion("god_count =", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountNotEqualTo(String value) {
            addCriterion("god_count <>", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountGreaterThan(String value) {
            addCriterion("god_count >", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountGreaterThanOrEqualTo(String value) {
            addCriterion("god_count >=", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountLessThan(String value) {
            addCriterion("god_count <", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountLessThanOrEqualTo(String value) {
            addCriterion("god_count <=", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountLike(String value) {
            addCriterion("god_count like", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountNotLike(String value) {
            addCriterion("god_count not like", value, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountIn(List<String> values) {
            addCriterion("god_count in", values, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountNotIn(List<String> values) {
            addCriterion("god_count not in", values, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountBetween(String value1, String value2) {
            addCriterion("god_count between", value1, value2, "godCount");
            return (Criteria) this;
        }

        public Criteria andGodCountNotBetween(String value1, String value2) {
            addCriterion("god_count not between", value1, value2, "godCount");
            return (Criteria) this;
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

        public Criteria andMbrIdIsNull() {
            addCriterion("mbr_id is null");
            return (Criteria) this;
        }

        public Criteria andMbrIdIsNotNull() {
            addCriterion("mbr_id is not null");
            return (Criteria) this;
        }

        public Criteria andMbrIdEqualTo(Integer value) {
            addCriterion("mbr_id =", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotEqualTo(Integer value) {
            addCriterion("mbr_id <>", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThan(Integer value) {
            addCriterion("mbr_id >", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mbr_id >=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThan(Integer value) {
            addCriterion("mbr_id <", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdLessThanOrEqualTo(Integer value) {
            addCriterion("mbr_id <=", value, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdIn(List<Integer> values) {
            addCriterion("mbr_id in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotIn(List<Integer> values) {
            addCriterion("mbr_id not in", values, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdBetween(Integer value1, Integer value2) {
            addCriterion("mbr_id between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andMbrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mbr_id not between", value1, value2, "mbrId");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationIsNull() {
            addCriterion("is_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationIsNotNull() {
            addCriterion("is_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationEqualTo(String value) {
            addCriterion("is_evaluation =", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationNotEqualTo(String value) {
            addCriterion("is_evaluation <>", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationGreaterThan(String value) {
            addCriterion("is_evaluation >", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("is_evaluation >=", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationLessThan(String value) {
            addCriterion("is_evaluation <", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationLessThanOrEqualTo(String value) {
            addCriterion("is_evaluation <=", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationLike(String value) {
            addCriterion("is_evaluation like", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationNotLike(String value) {
            addCriterion("is_evaluation not like", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationIn(List<String> values) {
            addCriterion("is_evaluation in", values, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationNotIn(List<String> values) {
            addCriterion("is_evaluation not in", values, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationBetween(String value1, String value2) {
            addCriterion("is_evaluation between", value1, value2, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationNotBetween(String value1, String value2) {
            addCriterion("is_evaluation not between", value1, value2, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andOdrPictureIsNull() {
            addCriterion("odr_picture is null");
            return (Criteria) this;
        }

        public Criteria andOdrPictureIsNotNull() {
            addCriterion("odr_picture is not null");
            return (Criteria) this;
        }

        public Criteria andOdrPictureEqualTo(String value) {
            addCriterion("odr_picture =", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureNotEqualTo(String value) {
            addCriterion("odr_picture <>", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureGreaterThan(String value) {
            addCriterion("odr_picture >", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureGreaterThanOrEqualTo(String value) {
            addCriterion("odr_picture >=", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureLessThan(String value) {
            addCriterion("odr_picture <", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureLessThanOrEqualTo(String value) {
            addCriterion("odr_picture <=", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureLike(String value) {
            addCriterion("odr_picture like", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureNotLike(String value) {
            addCriterion("odr_picture not like", value, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureIn(List<String> values) {
            addCriterion("odr_picture in", values, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureNotIn(List<String> values) {
            addCriterion("odr_picture not in", values, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureBetween(String value1, String value2) {
            addCriterion("odr_picture between", value1, value2, "odrPicture");
            return (Criteria) this;
        }

        public Criteria andOdrPictureNotBetween(String value1, String value2) {
            addCriterion("odr_picture not between", value1, value2, "odrPicture");
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