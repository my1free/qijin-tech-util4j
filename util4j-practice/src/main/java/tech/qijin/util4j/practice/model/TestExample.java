package tech.qijin.util4j.practice.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCol1IsNull() {
            addCriterion("col1 is null");
            return (Criteria) this;
        }

        public Criteria andCol1IsNotNull() {
            addCriterion("col1 is not null");
            return (Criteria) this;
        }

        public Criteria andCol1EqualTo(Integer value) {
            addCriterion("col1 =", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1NotEqualTo(Integer value) {
            addCriterion("col1 <>", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1GreaterThan(Integer value) {
            addCriterion("col1 >", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1GreaterThanOrEqualTo(Integer value) {
            addCriterion("col1 >=", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1LessThan(Integer value) {
            addCriterion("col1 <", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1LessThanOrEqualTo(Integer value) {
            addCriterion("col1 <=", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1In(List<Integer> values) {
            addCriterion("col1 in", values, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1NotIn(List<Integer> values) {
            addCriterion("col1 not in", values, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1Between(Integer value1, Integer value2) {
            addCriterion("col1 between", value1, value2, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1NotBetween(Integer value1, Integer value2) {
            addCriterion("col1 not between", value1, value2, "col1");
            return (Criteria) this;
        }

        public Criteria andCol2IsNull() {
            addCriterion("col2 is null");
            return (Criteria) this;
        }

        public Criteria andCol2IsNotNull() {
            addCriterion("col2 is not null");
            return (Criteria) this;
        }

        public Criteria andCol2EqualTo(String value) {
            addCriterion("col2 =", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotEqualTo(String value) {
            addCriterion("col2 <>", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2GreaterThan(String value) {
            addCriterion("col2 >", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2GreaterThanOrEqualTo(String value) {
            addCriterion("col2 >=", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2LessThan(String value) {
            addCriterion("col2 <", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2LessThanOrEqualTo(String value) {
            addCriterion("col2 <=", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2Like(String value) {
            addCriterion("col2 like", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotLike(String value) {
            addCriterion("col2 not like", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2In(List<String> values) {
            addCriterion("col2 in", values, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotIn(List<String> values) {
            addCriterion("col2 not in", values, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2Between(String value1, String value2) {
            addCriterion("col2 between", value1, value2, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotBetween(String value1, String value2) {
            addCriterion("col2 not between", value1, value2, "col2");
            return (Criteria) this;
        }

        public Criteria andCol3IsNull() {
            addCriterion("col3 is null");
            return (Criteria) this;
        }

        public Criteria andCol3IsNotNull() {
            addCriterion("col3 is not null");
            return (Criteria) this;
        }

        public Criteria andCol3EqualTo(BigDecimal value) {
            addCriterion("col3 =", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3NotEqualTo(BigDecimal value) {
            addCriterion("col3 <>", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3GreaterThan(BigDecimal value) {
            addCriterion("col3 >", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("col3 >=", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3LessThan(BigDecimal value) {
            addCriterion("col3 <", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("col3 <=", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3In(List<BigDecimal> values) {
            addCriterion("col3 in", values, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3NotIn(List<BigDecimal> values) {
            addCriterion("col3 not in", values, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("col3 between", value1, value2, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("col3 not between", value1, value2, "col3");
            return (Criteria) this;
        }

        public Criteria andEnvIsNull() {
            addCriterion("env is null");
            return (Criteria) this;
        }

        public Criteria andEnvIsNotNull() {
            addCriterion("env is not null");
            return (Criteria) this;
        }

        public Criteria andEnvEqualTo(Byte value) {
            addCriterion("env =", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotEqualTo(Byte value) {
            addCriterion("env <>", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThan(Byte value) {
            addCriterion("env >", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThanOrEqualTo(Byte value) {
            addCriterion("env >=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThan(Byte value) {
            addCriterion("env <", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThanOrEqualTo(Byte value) {
            addCriterion("env <=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvIn(List<Byte> values) {
            addCriterion("env in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotIn(List<Byte> values) {
            addCriterion("env not in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvBetween(Byte value1, Byte value2) {
            addCriterion("env between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotBetween(Byte value1, Byte value2) {
            addCriterion("env not between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Byte value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Byte value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Byte value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Byte value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Byte value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Byte> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Byte> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Byte value1, Byte value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Byte value1, Byte value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
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