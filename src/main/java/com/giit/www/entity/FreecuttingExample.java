package com.giit.www.entity;

import java.util.ArrayList;
import java.util.List;

public class FreecuttingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public FreecuttingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
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

        public Criteria andCutnumberIsNull() {
            addCriterion("Cutnumber is null");
            return (Criteria) this;
        }

        public Criteria andCutnumberIsNotNull() {
            addCriterion("Cutnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCutnumberEqualTo(String value) {
            addCriterion("Cutnumber =", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberNotEqualTo(String value) {
            addCriterion("Cutnumber <>", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberGreaterThan(String value) {
            addCriterion("Cutnumber >", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Cutnumber >=", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberLessThan(String value) {
            addCriterion("Cutnumber <", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberLessThanOrEqualTo(String value) {
            addCriterion("Cutnumber <=", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberLike(String value) {
            addCriterion("Cutnumber like", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberNotLike(String value) {
            addCriterion("Cutnumber not like", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberIn(List<String> values) {
            addCriterion("Cutnumber in", values, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberNotIn(List<String> values) {
            addCriterion("Cutnumber not in", values, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberBetween(String value1, String value2) {
            addCriterion("Cutnumber between", value1, value2, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberNotBetween(String value1, String value2) {
            addCriterion("Cutnumber not between", value1, value2, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnameIsNull() {
            addCriterion("Cutname is null");
            return (Criteria) this;
        }

        public Criteria andCutnameIsNotNull() {
            addCriterion("Cutname is not null");
            return (Criteria) this;
        }

        public Criteria andCutnameEqualTo(String value) {
            addCriterion("Cutname =", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameNotEqualTo(String value) {
            addCriterion("Cutname <>", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameGreaterThan(String value) {
            addCriterion("Cutname >", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameGreaterThanOrEqualTo(String value) {
            addCriterion("Cutname >=", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameLessThan(String value) {
            addCriterion("Cutname <", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameLessThanOrEqualTo(String value) {
            addCriterion("Cutname <=", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameLike(String value) {
            addCriterion("Cutname like", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameNotLike(String value) {
            addCriterion("Cutname not like", value, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameIn(List<String> values) {
            addCriterion("Cutname in", values, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameNotIn(List<String> values) {
            addCriterion("Cutname not in", values, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameBetween(String value1, String value2) {
            addCriterion("Cutname between", value1, value2, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutnameNotBetween(String value1, String value2) {
            addCriterion("Cutname not between", value1, value2, "cutname");
            return (Criteria) this;
        }

        public Criteria andCutexpressIsNull() {
            addCriterion("CutExpress is null");
            return (Criteria) this;
        }

        public Criteria andCutexpressIsNotNull() {
            addCriterion("CutExpress is not null");
            return (Criteria) this;
        }

        public Criteria andCutexpressEqualTo(String value) {
            addCriterion("CutExpress =", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressNotEqualTo(String value) {
            addCriterion("CutExpress <>", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressGreaterThan(String value) {
            addCriterion("CutExpress >", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressGreaterThanOrEqualTo(String value) {
            addCriterion("CutExpress >=", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressLessThan(String value) {
            addCriterion("CutExpress <", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressLessThanOrEqualTo(String value) {
            addCriterion("CutExpress <=", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressLike(String value) {
            addCriterion("CutExpress like", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressNotLike(String value) {
            addCriterion("CutExpress not like", value, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressIn(List<String> values) {
            addCriterion("CutExpress in", values, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressNotIn(List<String> values) {
            addCriterion("CutExpress not in", values, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressBetween(String value1, String value2) {
            addCriterion("CutExpress between", value1, value2, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andCutexpressNotBetween(String value1, String value2) {
            addCriterion("CutExpress not between", value1, value2, "cutexpress");
            return (Criteria) this;
        }

        public Criteria andIlligaldescIsNull() {
            addCriterion("IlligalDesc is null");
            return (Criteria) this;
        }

        public Criteria andIlligaldescIsNotNull() {
            addCriterion("IlligalDesc is not null");
            return (Criteria) this;
        }

        public Criteria andIlligaldescEqualTo(String value) {
            addCriterion("IlligalDesc =", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescNotEqualTo(String value) {
            addCriterion("IlligalDesc <>", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescGreaterThan(String value) {
            addCriterion("IlligalDesc >", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescGreaterThanOrEqualTo(String value) {
            addCriterion("IlligalDesc >=", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescLessThan(String value) {
            addCriterion("IlligalDesc <", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescLessThanOrEqualTo(String value) {
            addCriterion("IlligalDesc <=", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescLike(String value) {
            addCriterion("IlligalDesc like", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescNotLike(String value) {
            addCriterion("IlligalDesc not like", value, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescIn(List<String> values) {
            addCriterion("IlligalDesc in", values, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescNotIn(List<String> values) {
            addCriterion("IlligalDesc not in", values, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescBetween(String value1, String value2) {
            addCriterion("IlligalDesc between", value1, value2, "illigaldesc");
            return (Criteria) this;
        }

        public Criteria andIlligaldescNotBetween(String value1, String value2) {
            addCriterion("IlligalDesc not between", value1, value2, "illigaldesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecutting
     *
     * @mbggenerated do_not_delete_during_merge Sun Jul 02 13:07:31 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table freecutting
     *
     * @mbggenerated Sun Jul 02 13:07:31 CST 2017
     */
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