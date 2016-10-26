package cn.edu.bupt.springmvc.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalExample() {
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

        public Criteria andHosnameIsNull() {
            addCriterion("hosName is null");
            return (Criteria) this;
        }

        public Criteria andHosnameIsNotNull() {
            addCriterion("hosName is not null");
            return (Criteria) this;
        }

        public Criteria andHosnameEqualTo(String value) {
            addCriterion("hosName =", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameNotEqualTo(String value) {
            addCriterion("hosName <>", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameGreaterThan(String value) {
            addCriterion("hosName >", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameGreaterThanOrEqualTo(String value) {
            addCriterion("hosName >=", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameLessThan(String value) {
            addCriterion("hosName <", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameLessThanOrEqualTo(String value) {
            addCriterion("hosName <=", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameLike(String value) {
            addCriterion("hosName like", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameNotLike(String value) {
            addCriterion("hosName not like", value, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameIn(List<String> values) {
            addCriterion("hosName in", values, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameNotIn(List<String> values) {
            addCriterion("hosName not in", values, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameBetween(String value1, String value2) {
            addCriterion("hosName between", value1, value2, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosnameNotBetween(String value1, String value2) {
            addCriterion("hosName not between", value1, value2, "hosname");
            return (Criteria) this;
        }

        public Criteria andHosgradeIsNull() {
            addCriterion("hosGrade is null");
            return (Criteria) this;
        }

        public Criteria andHosgradeIsNotNull() {
            addCriterion("hosGrade is not null");
            return (Criteria) this;
        }

        public Criteria andHosgradeEqualTo(String value) {
            addCriterion("hosGrade =", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeNotEqualTo(String value) {
            addCriterion("hosGrade <>", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeGreaterThan(String value) {
            addCriterion("hosGrade >", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeGreaterThanOrEqualTo(String value) {
            addCriterion("hosGrade >=", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeLessThan(String value) {
            addCriterion("hosGrade <", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeLessThanOrEqualTo(String value) {
            addCriterion("hosGrade <=", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeLike(String value) {
            addCriterion("hosGrade like", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeNotLike(String value) {
            addCriterion("hosGrade not like", value, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeIn(List<String> values) {
            addCriterion("hosGrade in", values, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeNotIn(List<String> values) {
            addCriterion("hosGrade not in", values, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeBetween(String value1, String value2) {
            addCriterion("hosGrade between", value1, value2, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosgradeNotBetween(String value1, String value2) {
            addCriterion("hosGrade not between", value1, value2, "hosgrade");
            return (Criteria) this;
        }

        public Criteria andHosaddrIsNull() {
            addCriterion("hosAddr is null");
            return (Criteria) this;
        }

        public Criteria andHosaddrIsNotNull() {
            addCriterion("hosAddr is not null");
            return (Criteria) this;
        }

        public Criteria andHosaddrEqualTo(String value) {
            addCriterion("hosAddr =", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrNotEqualTo(String value) {
            addCriterion("hosAddr <>", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrGreaterThan(String value) {
            addCriterion("hosAddr >", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrGreaterThanOrEqualTo(String value) {
            addCriterion("hosAddr >=", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrLessThan(String value) {
            addCriterion("hosAddr <", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrLessThanOrEqualTo(String value) {
            addCriterion("hosAddr <=", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrLike(String value) {
            addCriterion("hosAddr like", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrNotLike(String value) {
            addCriterion("hosAddr not like", value, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrIn(List<String> values) {
            addCriterion("hosAddr in", values, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrNotIn(List<String> values) {
            addCriterion("hosAddr not in", values, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrBetween(String value1, String value2) {
            addCriterion("hosAddr between", value1, value2, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHosaddrNotBetween(String value1, String value2) {
            addCriterion("hosAddr not between", value1, value2, "hosaddr");
            return (Criteria) this;
        }

        public Criteria andHostelIsNull() {
            addCriterion("hosTel is null");
            return (Criteria) this;
        }

        public Criteria andHostelIsNotNull() {
            addCriterion("hosTel is not null");
            return (Criteria) this;
        }

        public Criteria andHostelEqualTo(String value) {
            addCriterion("hosTel =", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelNotEqualTo(String value) {
            addCriterion("hosTel <>", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelGreaterThan(String value) {
            addCriterion("hosTel >", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelGreaterThanOrEqualTo(String value) {
            addCriterion("hosTel >=", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelLessThan(String value) {
            addCriterion("hosTel <", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelLessThanOrEqualTo(String value) {
            addCriterion("hosTel <=", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelLike(String value) {
            addCriterion("hosTel like", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelNotLike(String value) {
            addCriterion("hosTel not like", value, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelIn(List<String> values) {
            addCriterion("hosTel in", values, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelNotIn(List<String> values) {
            addCriterion("hosTel not in", values, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelBetween(String value1, String value2) {
            addCriterion("hosTel between", value1, value2, "hostel");
            return (Criteria) this;
        }

        public Criteria andHostelNotBetween(String value1, String value2) {
            addCriterion("hosTel not between", value1, value2, "hostel");
            return (Criteria) this;
        }

        public Criteria andHosintroIsNull() {
            addCriterion("hosIntro is null");
            return (Criteria) this;
        }

        public Criteria andHosintroIsNotNull() {
            addCriterion("hosIntro is not null");
            return (Criteria) this;
        }

        public Criteria andHosintroEqualTo(String value) {
            addCriterion("hosIntro =", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroNotEqualTo(String value) {
            addCriterion("hosIntro <>", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroGreaterThan(String value) {
            addCriterion("hosIntro >", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroGreaterThanOrEqualTo(String value) {
            addCriterion("hosIntro >=", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroLessThan(String value) {
            addCriterion("hosIntro <", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroLessThanOrEqualTo(String value) {
            addCriterion("hosIntro <=", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroLike(String value) {
            addCriterion("hosIntro like", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroNotLike(String value) {
            addCriterion("hosIntro not like", value, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroIn(List<String> values) {
            addCriterion("hosIntro in", values, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroNotIn(List<String> values) {
            addCriterion("hosIntro not in", values, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroBetween(String value1, String value2) {
            addCriterion("hosIntro between", value1, value2, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosintroNotBetween(String value1, String value2) {
            addCriterion("hosIntro not between", value1, value2, "hosintro");
            return (Criteria) this;
        }

        public Criteria andHosurlIsNull() {
            addCriterion("hosUrl is null");
            return (Criteria) this;
        }

        public Criteria andHosurlIsNotNull() {
            addCriterion("hosUrl is not null");
            return (Criteria) this;
        }

        public Criteria andHosurlEqualTo(String value) {
            addCriterion("hosUrl =", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlNotEqualTo(String value) {
            addCriterion("hosUrl <>", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlGreaterThan(String value) {
            addCriterion("hosUrl >", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlGreaterThanOrEqualTo(String value) {
            addCriterion("hosUrl >=", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlLessThan(String value) {
            addCriterion("hosUrl <", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlLessThanOrEqualTo(String value) {
            addCriterion("hosUrl <=", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlLike(String value) {
            addCriterion("hosUrl like", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlNotLike(String value) {
            addCriterion("hosUrl not like", value, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlIn(List<String> values) {
            addCriterion("hosUrl in", values, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlNotIn(List<String> values) {
            addCriterion("hosUrl not in", values, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlBetween(String value1, String value2) {
            addCriterion("hosUrl between", value1, value2, "hosurl");
            return (Criteria) this;
        }

        public Criteria andHosurlNotBetween(String value1, String value2) {
            addCriterion("hosUrl not between", value1, value2, "hosurl");
            return (Criteria) this;
        }

        public Criteria andDeanIsNull() {
            addCriterion("dean is null");
            return (Criteria) this;
        }

        public Criteria andDeanIsNotNull() {
            addCriterion("dean is not null");
            return (Criteria) this;
        }

        public Criteria andDeanEqualTo(String value) {
            addCriterion("dean =", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotEqualTo(String value) {
            addCriterion("dean <>", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanGreaterThan(String value) {
            addCriterion("dean >", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanGreaterThanOrEqualTo(String value) {
            addCriterion("dean >=", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanLessThan(String value) {
            addCriterion("dean <", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanLessThanOrEqualTo(String value) {
            addCriterion("dean <=", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanLike(String value) {
            addCriterion("dean like", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotLike(String value) {
            addCriterion("dean not like", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanIn(List<String> values) {
            addCriterion("dean in", values, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotIn(List<String> values) {
            addCriterion("dean not in", values, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanBetween(String value1, String value2) {
            addCriterion("dean between", value1, value2, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotBetween(String value1, String value2) {
            addCriterion("dean not between", value1, value2, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanintroIsNull() {
            addCriterion("deanIntro is null");
            return (Criteria) this;
        }

        public Criteria andDeanintroIsNotNull() {
            addCriterion("deanIntro is not null");
            return (Criteria) this;
        }

        public Criteria andDeanintroEqualTo(String value) {
            addCriterion("deanIntro =", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroNotEqualTo(String value) {
            addCriterion("deanIntro <>", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroGreaterThan(String value) {
            addCriterion("deanIntro >", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroGreaterThanOrEqualTo(String value) {
            addCriterion("deanIntro >=", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroLessThan(String value) {
            addCriterion("deanIntro <", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroLessThanOrEqualTo(String value) {
            addCriterion("deanIntro <=", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroLike(String value) {
            addCriterion("deanIntro like", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroNotLike(String value) {
            addCriterion("deanIntro not like", value, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroIn(List<String> values) {
            addCriterion("deanIntro in", values, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroNotIn(List<String> values) {
            addCriterion("deanIntro not in", values, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroBetween(String value1, String value2) {
            addCriterion("deanIntro between", value1, value2, "deanintro");
            return (Criteria) this;
        }

        public Criteria andDeanintroNotBetween(String value1, String value2) {
            addCriterion("deanIntro not between", value1, value2, "deanintro");
            return (Criteria) this;
        }

        public Criteria andHostrafficIsNull() {
            addCriterion("hosTraffic is null");
            return (Criteria) this;
        }

        public Criteria andHostrafficIsNotNull() {
            addCriterion("hosTraffic is not null");
            return (Criteria) this;
        }

        public Criteria andHostrafficEqualTo(String value) {
            addCriterion("hosTraffic =", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficNotEqualTo(String value) {
            addCriterion("hosTraffic <>", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficGreaterThan(String value) {
            addCriterion("hosTraffic >", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficGreaterThanOrEqualTo(String value) {
            addCriterion("hosTraffic >=", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficLessThan(String value) {
            addCriterion("hosTraffic <", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficLessThanOrEqualTo(String value) {
            addCriterion("hosTraffic <=", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficLike(String value) {
            addCriterion("hosTraffic like", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficNotLike(String value) {
            addCriterion("hosTraffic not like", value, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficIn(List<String> values) {
            addCriterion("hosTraffic in", values, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficNotIn(List<String> values) {
            addCriterion("hosTraffic not in", values, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficBetween(String value1, String value2) {
            addCriterion("hosTraffic between", value1, value2, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHostrafficNotBetween(String value1, String value2) {
            addCriterion("hosTraffic not between", value1, value2, "hostraffic");
            return (Criteria) this;
        }

        public Criteria andHosspecialIsNull() {
            addCriterion("hosSpecial is null");
            return (Criteria) this;
        }

        public Criteria andHosspecialIsNotNull() {
            addCriterion("hosSpecial is not null");
            return (Criteria) this;
        }

        public Criteria andHosspecialEqualTo(String value) {
            addCriterion("hosSpecial =", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialNotEqualTo(String value) {
            addCriterion("hosSpecial <>", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialGreaterThan(String value) {
            addCriterion("hosSpecial >", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialGreaterThanOrEqualTo(String value) {
            addCriterion("hosSpecial >=", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialLessThan(String value) {
            addCriterion("hosSpecial <", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialLessThanOrEqualTo(String value) {
            addCriterion("hosSpecial <=", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialLike(String value) {
            addCriterion("hosSpecial like", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialNotLike(String value) {
            addCriterion("hosSpecial not like", value, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialIn(List<String> values) {
            addCriterion("hosSpecial in", values, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialNotIn(List<String> values) {
            addCriterion("hosSpecial not in", values, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialBetween(String value1, String value2) {
            addCriterion("hosSpecial between", value1, value2, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosspecialNotBetween(String value1, String value2) {
            addCriterion("hosSpecial not between", value1, value2, "hosspecial");
            return (Criteria) this;
        }

        public Criteria andHosestablishedIsNull() {
            addCriterion("hosEstablished is null");
            return (Criteria) this;
        }

        public Criteria andHosestablishedIsNotNull() {
            addCriterion("hosEstablished is not null");
            return (Criteria) this;
        }

        public Criteria andHosestablishedEqualTo(Date value) {
            addCriterionForJDBCDate("hosEstablished =", value, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedNotEqualTo(Date value) {
            addCriterionForJDBCDate("hosEstablished <>", value, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedGreaterThan(Date value) {
            addCriterionForJDBCDate("hosEstablished >", value, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hosEstablished >=", value, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedLessThan(Date value) {
            addCriterionForJDBCDate("hosEstablished <", value, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hosEstablished <=", value, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedIn(List<Date> values) {
            addCriterionForJDBCDate("hosEstablished in", values, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedNotIn(List<Date> values) {
            addCriterionForJDBCDate("hosEstablished not in", values, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hosEstablished between", value1, value2, "hosestablished");
            return (Criteria) this;
        }

        public Criteria andHosestablishedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hosEstablished not between", value1, value2, "hosestablished");
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