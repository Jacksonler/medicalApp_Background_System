package cn.edu.bupt.springmvc.web.model;

import java.util.ArrayList;
import java.util.List;

public class OutpatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutpatientExample() {
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

        public Criteria andOutpatientidIsNull() {
            addCriterion("outpatientId is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientidIsNotNull() {
            addCriterion("outpatientId is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientidEqualTo(String value) {
            addCriterion("outpatientId =", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotEqualTo(String value) {
            addCriterion("outpatientId <>", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidGreaterThan(String value) {
            addCriterion("outpatientId >", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidGreaterThanOrEqualTo(String value) {
            addCriterion("outpatientId >=", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidLessThan(String value) {
            addCriterion("outpatientId <", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidLessThanOrEqualTo(String value) {
            addCriterion("outpatientId <=", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidLike(String value) {
            addCriterion("outpatientId like", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotLike(String value) {
            addCriterion("outpatientId not like", value, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidIn(List<String> values) {
            addCriterion("outpatientId in", values, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotIn(List<String> values) {
            addCriterion("outpatientId not in", values, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidBetween(String value1, String value2) {
            addCriterion("outpatientId between", value1, value2, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientidNotBetween(String value1, String value2) {
            addCriterion("outpatientId not between", value1, value2, "outpatientid");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameIsNull() {
            addCriterion("outpatientName is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameIsNotNull() {
            addCriterion("outpatientName is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameEqualTo(String value) {
            addCriterion("outpatientName =", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameNotEqualTo(String value) {
            addCriterion("outpatientName <>", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameGreaterThan(String value) {
            addCriterion("outpatientName >", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameGreaterThanOrEqualTo(String value) {
            addCriterion("outpatientName >=", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameLessThan(String value) {
            addCriterion("outpatientName <", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameLessThanOrEqualTo(String value) {
            addCriterion("outpatientName <=", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameLike(String value) {
            addCriterion("outpatientName like", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameNotLike(String value) {
            addCriterion("outpatientName not like", value, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameIn(List<String> values) {
            addCriterion("outpatientName in", values, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameNotIn(List<String> values) {
            addCriterion("outpatientName not in", values, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameBetween(String value1, String value2) {
            addCriterion("outpatientName between", value1, value2, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andOutpatientnameNotBetween(String value1, String value2) {
            addCriterion("outpatientName not between", value1, value2, "outpatientname");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNull() {
            addCriterion("sectionId is null");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNotNull() {
            addCriterion("sectionId is not null");
            return (Criteria) this;
        }

        public Criteria andSectionidEqualTo(String value) {
            addCriterion("sectionId =", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotEqualTo(String value) {
            addCriterion("sectionId <>", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThan(String value) {
            addCriterion("sectionId >", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThanOrEqualTo(String value) {
            addCriterion("sectionId >=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThan(String value) {
            addCriterion("sectionId <", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThanOrEqualTo(String value) {
            addCriterion("sectionId <=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLike(String value) {
            addCriterion("sectionId like", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotLike(String value) {
            addCriterion("sectionId not like", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIn(List<String> values) {
            addCriterion("sectionId in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotIn(List<String> values) {
            addCriterion("sectionId not in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidBetween(String value1, String value2) {
            addCriterion("sectionId between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotBetween(String value1, String value2) {
            addCriterion("sectionId not between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionnameIsNull() {
            addCriterion("sectionName is null");
            return (Criteria) this;
        }

        public Criteria andSectionnameIsNotNull() {
            addCriterion("sectionName is not null");
            return (Criteria) this;
        }

        public Criteria andSectionnameEqualTo(String value) {
            addCriterion("sectionName =", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotEqualTo(String value) {
            addCriterion("sectionName <>", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameGreaterThan(String value) {
            addCriterion("sectionName >", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameGreaterThanOrEqualTo(String value) {
            addCriterion("sectionName >=", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLessThan(String value) {
            addCriterion("sectionName <", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLessThanOrEqualTo(String value) {
            addCriterion("sectionName <=", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameLike(String value) {
            addCriterion("sectionName like", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotLike(String value) {
            addCriterion("sectionName not like", value, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameIn(List<String> values) {
            addCriterion("sectionName in", values, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotIn(List<String> values) {
            addCriterion("sectionName not in", values, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameBetween(String value1, String value2) {
            addCriterion("sectionName between", value1, value2, "sectionname");
            return (Criteria) this;
        }

        public Criteria andSectionnameNotBetween(String value1, String value2) {
            addCriterion("sectionName not between", value1, value2, "sectionname");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNull() {
            addCriterion("doctorName is null");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNotNull() {
            addCriterion("doctorName is not null");
            return (Criteria) this;
        }

        public Criteria andDoctornameEqualTo(String value) {
            addCriterion("doctorName =", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotEqualTo(String value) {
            addCriterion("doctorName <>", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThan(String value) {
            addCriterion("doctorName >", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorName >=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThan(String value) {
            addCriterion("doctorName <", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThanOrEqualTo(String value) {
            addCriterion("doctorName <=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLike(String value) {
            addCriterion("doctorName like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotLike(String value) {
            addCriterion("doctorName not like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameIn(List<String> values) {
            addCriterion("doctorName in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotIn(List<String> values) {
            addCriterion("doctorName not in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameBetween(String value1, String value2) {
            addCriterion("doctorName between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotBetween(String value1, String value2) {
            addCriterion("doctorName not between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocIsNull() {
            addCriterion("outpatientLoc is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocIsNotNull() {
            addCriterion("outpatientLoc is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocEqualTo(String value) {
            addCriterion("outpatientLoc =", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocNotEqualTo(String value) {
            addCriterion("outpatientLoc <>", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocGreaterThan(String value) {
            addCriterion("outpatientLoc >", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocGreaterThanOrEqualTo(String value) {
            addCriterion("outpatientLoc >=", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocLessThan(String value) {
            addCriterion("outpatientLoc <", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocLessThanOrEqualTo(String value) {
            addCriterion("outpatientLoc <=", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocLike(String value) {
            addCriterion("outpatientLoc like", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocNotLike(String value) {
            addCriterion("outpatientLoc not like", value, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocIn(List<String> values) {
            addCriterion("outpatientLoc in", values, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocNotIn(List<String> values) {
            addCriterion("outpatientLoc not in", values, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocBetween(String value1, String value2) {
            addCriterion("outpatientLoc between", value1, value2, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andOutpatientlocNotBetween(String value1, String value2) {
            addCriterion("outpatientLoc not between", value1, value2, "outpatientloc");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
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