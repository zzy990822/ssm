package com.tan.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdmIdIsNull() {
            addCriterion("adm_id is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("adm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(Integer value) {
            addCriterion("adm_id =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(Integer value) {
            addCriterion("adm_id <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(Integer value) {
            addCriterion("adm_id >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adm_id >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(Integer value) {
            addCriterion("adm_id <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(Integer value) {
            addCriterion("adm_id <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<Integer> values) {
            addCriterion("adm_id in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<Integer> values) {
            addCriterion("adm_id not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(Integer value1, Integer value2) {
            addCriterion("adm_id between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adm_id not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmNameIsNull() {
            addCriterion("adm_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmNameIsNotNull() {
            addCriterion("adm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmNameEqualTo(String value) {
            addCriterion("adm_name =", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotEqualTo(String value) {
            addCriterion("adm_name <>", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameGreaterThan(String value) {
            addCriterion("adm_name >", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameGreaterThanOrEqualTo(String value) {
            addCriterion("adm_name >=", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameLessThan(String value) {
            addCriterion("adm_name <", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameLessThanOrEqualTo(String value) {
            addCriterion("adm_name <=", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameLike(String value) {
            addCriterion("adm_name like", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotLike(String value) {
            addCriterion("adm_name not like", value, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameIn(List<String> values) {
            addCriterion("adm_name in", values, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotIn(List<String> values) {
            addCriterion("adm_name not in", values, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameBetween(String value1, String value2) {
            addCriterion("adm_name between", value1, value2, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmNameNotBetween(String value1, String value2) {
            addCriterion("adm_name not between", value1, value2, "admName");
            return (Criteria) this;
        }

        public Criteria andAdmPwdIsNull() {
            addCriterion("adm_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAdmPwdIsNotNull() {
            addCriterion("adm_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdmPwdEqualTo(String value) {
            addCriterion("adm_pwd =", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdNotEqualTo(String value) {
            addCriterion("adm_pwd <>", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdGreaterThan(String value) {
            addCriterion("adm_pwd >", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdGreaterThanOrEqualTo(String value) {
            addCriterion("adm_pwd >=", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdLessThan(String value) {
            addCriterion("adm_pwd <", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdLessThanOrEqualTo(String value) {
            addCriterion("adm_pwd <=", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdLike(String value) {
            addCriterion("adm_pwd like", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdNotLike(String value) {
            addCriterion("adm_pwd not like", value, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdIn(List<String> values) {
            addCriterion("adm_pwd in", values, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdNotIn(List<String> values) {
            addCriterion("adm_pwd not in", values, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdBetween(String value1, String value2) {
            addCriterion("adm_pwd between", value1, value2, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmPwdNotBetween(String value1, String value2) {
            addCriterion("adm_pwd not between", value1, value2, "admPwd");
            return (Criteria) this;
        }

        public Criteria andAdmStbIsNull() {
            addCriterion("adm_stb is null");
            return (Criteria) this;
        }

        public Criteria andAdmStbIsNotNull() {
            addCriterion("adm_stb is not null");
            return (Criteria) this;
        }

        public Criteria andAdmStbEqualTo(String value) {
            addCriterion("adm_stb =", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbNotEqualTo(String value) {
            addCriterion("adm_stb <>", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbGreaterThan(String value) {
            addCriterion("adm_stb >", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbGreaterThanOrEqualTo(String value) {
            addCriterion("adm_stb >=", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbLessThan(String value) {
            addCriterion("adm_stb <", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbLessThanOrEqualTo(String value) {
            addCriterion("adm_stb <=", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbLike(String value) {
            addCriterion("adm_stb like", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbNotLike(String value) {
            addCriterion("adm_stb not like", value, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbIn(List<String> values) {
            addCriterion("adm_stb in", values, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbNotIn(List<String> values) {
            addCriterion("adm_stb not in", values, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbBetween(String value1, String value2) {
            addCriterion("adm_stb between", value1, value2, "admStb");
            return (Criteria) this;
        }

        public Criteria andAdmStbNotBetween(String value1, String value2) {
            addCriterion("adm_stb not between", value1, value2, "admStb");
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