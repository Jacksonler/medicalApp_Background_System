package cn.edu.bupt.springmvc.web.model;

import java.util.ArrayList;
import java.util.List;

public class SectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SectionExample() {
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

        public Criteria andHosidIsNull() {
            addCriterion("hosId is null");
            return (Criteria) this;
        }

        public Criteria andHosidIsNotNull() {
            addCriterion("hosId is not null");
            return (Criteria) this;
        }

        public Criteria andHosidEqualTo(String value) {
            addCriterion("hosId =", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidNotEqualTo(String value) {
            addCriterion("hosId <>", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidGreaterThan(String value) {
            addCriterion("hosId >", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidGreaterThanOrEqualTo(String value) {
            addCriterion("hosId >=", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidLessThan(String value) {
            addCriterion("hosId <", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidLessThanOrEqualTo(String value) {
            addCriterion("hosId <=", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidLike(String value) {
            addCriterion("hosId like", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidNotLike(String value) {
            addCriterion("hosId not like", value, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidIn(List<String> values) {
            addCriterion("hosId in", values, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidNotIn(List<String> values) {
            addCriterion("hosId not in", values, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidBetween(String value1, String value2) {
            addCriterion("hosId between", value1, value2, "hosid");
            return (Criteria) this;
        }

        public Criteria andHosidNotBetween(String value1, String value2) {
            addCriterion("hosId not between", value1, value2, "hosid");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIsNull() {
            addCriterion("sectionCode is null");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIsNotNull() {
            addCriterion("sectionCode is not null");
            return (Criteria) this;
        }

        public Criteria andSectioncodeEqualTo(String value) {
            addCriterion("sectionCode =", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotEqualTo(String value) {
            addCriterion("sectionCode <>", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeGreaterThan(String value) {
            addCriterion("sectionCode >", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("sectionCode >=", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLessThan(String value) {
            addCriterion("sectionCode <", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLessThanOrEqualTo(String value) {
            addCriterion("sectionCode <=", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeLike(String value) {
            addCriterion("sectionCode like", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotLike(String value) {
            addCriterion("sectionCode not like", value, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeIn(List<String> values) {
            addCriterion("sectionCode in", values, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotIn(List<String> values) {
            addCriterion("sectionCode not in", values, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeBetween(String value1, String value2) {
            addCriterion("sectionCode between", value1, value2, "sectioncode");
            return (Criteria) this;
        }

        public Criteria andSectioncodeNotBetween(String value1, String value2) {
            addCriterion("sectionCode not between", value1, value2, "sectioncode");
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

        public Criteria andSectionintroIsNull() {
            addCriterion("sectionIntro is null");
            return (Criteria) this;
        }

        public Criteria andSectionintroIsNotNull() {
            addCriterion("sectionIntro is not null");
            return (Criteria) this;
        }

        public Criteria andSectionintroEqualTo(String value) {
            addCriterion("sectionIntro =", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroNotEqualTo(String value) {
            addCriterion("sectionIntro <>", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroGreaterThan(String value) {
            addCriterion("sectionIntro >", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroGreaterThanOrEqualTo(String value) {
            addCriterion("sectionIntro >=", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroLessThan(String value) {
            addCriterion("sectionIntro <", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroLessThanOrEqualTo(String value) {
            addCriterion("sectionIntro <=", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroLike(String value) {
            addCriterion("sectionIntro like", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroNotLike(String value) {
            addCriterion("sectionIntro not like", value, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroIn(List<String> values) {
            addCriterion("sectionIntro in", values, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroNotIn(List<String> values) {
            addCriterion("sectionIntro not in", values, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroBetween(String value1, String value2) {
            addCriterion("sectionIntro between", value1, value2, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionintroNotBetween(String value1, String value2) {
            addCriterion("sectionIntro not between", value1, value2, "sectionintro");
            return (Criteria) this;
        }

        public Criteria andSectionpicIsNull() {
            addCriterion("sectionPic is null");
            return (Criteria) this;
        }

        public Criteria andSectionpicIsNotNull() {
            addCriterion("sectionPic is not null");
            return (Criteria) this;
        }

        public Criteria andSectionpicEqualTo(String value) {
            addCriterion("sectionPic =", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicNotEqualTo(String value) {
            addCriterion("sectionPic <>", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicGreaterThan(String value) {
            addCriterion("sectionPic >", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicGreaterThanOrEqualTo(String value) {
            addCriterion("sectionPic >=", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicLessThan(String value) {
            addCriterion("sectionPic <", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicLessThanOrEqualTo(String value) {
            addCriterion("sectionPic <=", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicLike(String value) {
            addCriterion("sectionPic like", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicNotLike(String value) {
            addCriterion("sectionPic not like", value, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicIn(List<String> values) {
            addCriterion("sectionPic in", values, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicNotIn(List<String> values) {
            addCriterion("sectionPic not in", values, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicBetween(String value1, String value2) {
            addCriterion("sectionPic between", value1, value2, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionpicNotBetween(String value1, String value2) {
            addCriterion("sectionPic not between", value1, value2, "sectionpic");
            return (Criteria) this;
        }

        public Criteria andSectionlocIsNull() {
            addCriterion("sectionLoc is null");
            return (Criteria) this;
        }

        public Criteria andSectionlocIsNotNull() {
            addCriterion("sectionLoc is not null");
            return (Criteria) this;
        }

        public Criteria andSectionlocEqualTo(String value) {
            addCriterion("sectionLoc =", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocNotEqualTo(String value) {
            addCriterion("sectionLoc <>", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocGreaterThan(String value) {
            addCriterion("sectionLoc >", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocGreaterThanOrEqualTo(String value) {
            addCriterion("sectionLoc >=", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocLessThan(String value) {
            addCriterion("sectionLoc <", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocLessThanOrEqualTo(String value) {
            addCriterion("sectionLoc <=", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocLike(String value) {
            addCriterion("sectionLoc like", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocNotLike(String value) {
            addCriterion("sectionLoc not like", value, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocIn(List<String> values) {
            addCriterion("sectionLoc in", values, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocNotIn(List<String> values) {
            addCriterion("sectionLoc not in", values, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocBetween(String value1, String value2) {
            addCriterion("sectionLoc between", value1, value2, "sectionloc");
            return (Criteria) this;
        }

        public Criteria andSectionlocNotBetween(String value1, String value2) {
            addCriterion("sectionLoc not between", value1, value2, "sectionloc");
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