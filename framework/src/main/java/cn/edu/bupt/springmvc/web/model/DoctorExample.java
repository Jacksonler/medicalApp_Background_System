package cn.edu.bupt.springmvc.web.model;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(String value) {
            addCriterion("doctorId =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(String value) {
            addCriterion("doctorId <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(String value) {
            addCriterion("doctorId >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(String value) {
            addCriterion("doctorId >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(String value) {
            addCriterion("doctorId <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(String value) {
            addCriterion("doctorId <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLike(String value) {
            addCriterion("doctorId like", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotLike(String value) {
            addCriterion("doctorId not like", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<String> values) {
            addCriterion("doctorId in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<String> values) {
            addCriterion("doctorId not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(String value1, String value2) {
            addCriterion("doctorId between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(String value1, String value2) {
            addCriterion("doctorId not between", value1, value2, "doctorid");
            return (Criteria) this;
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

        public Criteria andPicheadIsNull() {
            addCriterion("picHead is null");
            return (Criteria) this;
        }

        public Criteria andPicheadIsNotNull() {
            addCriterion("picHead is not null");
            return (Criteria) this;
        }

        public Criteria andPicheadEqualTo(String value) {
            addCriterion("picHead =", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadNotEqualTo(String value) {
            addCriterion("picHead <>", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadGreaterThan(String value) {
            addCriterion("picHead >", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadGreaterThanOrEqualTo(String value) {
            addCriterion("picHead >=", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadLessThan(String value) {
            addCriterion("picHead <", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadLessThanOrEqualTo(String value) {
            addCriterion("picHead <=", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadLike(String value) {
            addCriterion("picHead like", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadNotLike(String value) {
            addCriterion("picHead not like", value, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadIn(List<String> values) {
            addCriterion("picHead in", values, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadNotIn(List<String> values) {
            addCriterion("picHead not in", values, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadBetween(String value1, String value2) {
            addCriterion("picHead between", value1, value2, "pichead");
            return (Criteria) this;
        }

        public Criteria andPicheadNotBetween(String value1, String value2) {
            addCriterion("picHead not between", value1, value2, "pichead");
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

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNull() {
            addCriterion("special is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNotNull() {
            addCriterion("special is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEqualTo(String value) {
            addCriterion("special =", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotEqualTo(String value) {
            addCriterion("special <>", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThan(String value) {
            addCriterion("special >", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("special >=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThan(String value) {
            addCriterion("special <", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThanOrEqualTo(String value) {
            addCriterion("special <=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLike(String value) {
            addCriterion("special like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotLike(String value) {
            addCriterion("special not like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialIn(List<String> values) {
            addCriterion("special in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotIn(List<String> values) {
            addCriterion("special not in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialBetween(String value1, String value2) {
            addCriterion("special between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotBetween(String value1, String value2) {
            addCriterion("special not between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSectionIsNull() {
            addCriterion("section is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("section is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(String value) {
            addCriterion("section =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(String value) {
            addCriterion("section <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(String value) {
            addCriterion("section >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(String value) {
            addCriterion("section >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(String value) {
            addCriterion("section <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(String value) {
            addCriterion("section <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLike(String value) {
            addCriterion("section like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotLike(String value) {
            addCriterion("section not like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<String> values) {
            addCriterion("section in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<String> values) {
            addCriterion("section not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(String value1, String value2) {
            addCriterion("section between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(String value1, String value2) {
            addCriterion("section not between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andDoctorintroIsNull() {
            addCriterion("doctorIntro is null");
            return (Criteria) this;
        }

        public Criteria andDoctorintroIsNotNull() {
            addCriterion("doctorIntro is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorintroEqualTo(String value) {
            addCriterion("doctorIntro =", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroNotEqualTo(String value) {
            addCriterion("doctorIntro <>", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroGreaterThan(String value) {
            addCriterion("doctorIntro >", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroGreaterThanOrEqualTo(String value) {
            addCriterion("doctorIntro >=", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroLessThan(String value) {
            addCriterion("doctorIntro <", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroLessThanOrEqualTo(String value) {
            addCriterion("doctorIntro <=", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroLike(String value) {
            addCriterion("doctorIntro like", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroNotLike(String value) {
            addCriterion("doctorIntro not like", value, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroIn(List<String> values) {
            addCriterion("doctorIntro in", values, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroNotIn(List<String> values) {
            addCriterion("doctorIntro not in", values, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroBetween(String value1, String value2) {
            addCriterion("doctorIntro between", value1, value2, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andDoctorintroNotBetween(String value1, String value2) {
            addCriterion("doctorIntro not between", value1, value2, "doctorintro");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Byte value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Byte value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Byte value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Byte value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Byte value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Byte> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Byte> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Byte value1, Byte value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionIsNull() {
            addCriterion("graduInstitution is null");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionIsNotNull() {
            addCriterion("graduInstitution is not null");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionEqualTo(String value) {
            addCriterion("graduInstitution =", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionNotEqualTo(String value) {
            addCriterion("graduInstitution <>", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionGreaterThan(String value) {
            addCriterion("graduInstitution >", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("graduInstitution >=", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionLessThan(String value) {
            addCriterion("graduInstitution <", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionLessThanOrEqualTo(String value) {
            addCriterion("graduInstitution <=", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionLike(String value) {
            addCriterion("graduInstitution like", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionNotLike(String value) {
            addCriterion("graduInstitution not like", value, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionIn(List<String> values) {
            addCriterion("graduInstitution in", values, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionNotIn(List<String> values) {
            addCriterion("graduInstitution not in", values, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionBetween(String value1, String value2) {
            addCriterion("graduInstitution between", value1, value2, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andGraduinstitutionNotBetween(String value1, String value2) {
            addCriterion("graduInstitution not between", value1, value2, "graduinstitution");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationIsNull() {
            addCriterion("tutorQualification is null");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationIsNotNull() {
            addCriterion("tutorQualification is not null");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationEqualTo(String value) {
            addCriterion("tutorQualification =", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationNotEqualTo(String value) {
            addCriterion("tutorQualification <>", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationGreaterThan(String value) {
            addCriterion("tutorQualification >", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationGreaterThanOrEqualTo(String value) {
            addCriterion("tutorQualification >=", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationLessThan(String value) {
            addCriterion("tutorQualification <", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationLessThanOrEqualTo(String value) {
            addCriterion("tutorQualification <=", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationLike(String value) {
            addCriterion("tutorQualification like", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationNotLike(String value) {
            addCriterion("tutorQualification not like", value, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationIn(List<String> values) {
            addCriterion("tutorQualification in", values, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationNotIn(List<String> values) {
            addCriterion("tutorQualification not in", values, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationBetween(String value1, String value2) {
            addCriterion("tutorQualification between", value1, value2, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andTutorqualificationNotBetween(String value1, String value2) {
            addCriterion("tutorQualification not between", value1, value2, "tutorqualification");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andMarjorIsNull() {
            addCriterion("marjor is null");
            return (Criteria) this;
        }

        public Criteria andMarjorIsNotNull() {
            addCriterion("marjor is not null");
            return (Criteria) this;
        }

        public Criteria andMarjorEqualTo(String value) {
            addCriterion("marjor =", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotEqualTo(String value) {
            addCriterion("marjor <>", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorGreaterThan(String value) {
            addCriterion("marjor >", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorGreaterThanOrEqualTo(String value) {
            addCriterion("marjor >=", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorLessThan(String value) {
            addCriterion("marjor <", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorLessThanOrEqualTo(String value) {
            addCriterion("marjor <=", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorLike(String value) {
            addCriterion("marjor like", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotLike(String value) {
            addCriterion("marjor not like", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorIn(List<String> values) {
            addCriterion("marjor in", values, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotIn(List<String> values) {
            addCriterion("marjor not in", values, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorBetween(String value1, String value2) {
            addCriterion("marjor between", value1, value2, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotBetween(String value1, String value2) {
            addCriterion("marjor not between", value1, value2, "marjor");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicIsNull() {
            addCriterion("partTimeAcademic is null");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicIsNotNull() {
            addCriterion("partTimeAcademic is not null");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicEqualTo(String value) {
            addCriterion("partTimeAcademic =", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicNotEqualTo(String value) {
            addCriterion("partTimeAcademic <>", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicGreaterThan(String value) {
            addCriterion("partTimeAcademic >", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicGreaterThanOrEqualTo(String value) {
            addCriterion("partTimeAcademic >=", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicLessThan(String value) {
            addCriterion("partTimeAcademic <", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicLessThanOrEqualTo(String value) {
            addCriterion("partTimeAcademic <=", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicLike(String value) {
            addCriterion("partTimeAcademic like", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicNotLike(String value) {
            addCriterion("partTimeAcademic not like", value, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicIn(List<String> values) {
            addCriterion("partTimeAcademic in", values, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicNotIn(List<String> values) {
            addCriterion("partTimeAcademic not in", values, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicBetween(String value1, String value2) {
            addCriterion("partTimeAcademic between", value1, value2, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andParttimeacademicNotBetween(String value1, String value2) {
            addCriterion("partTimeAcademic not between", value1, value2, "parttimeacademic");
            return (Criteria) this;
        }

        public Criteria andCertificateholdIsNull() {
            addCriterion("certificateHold is null");
            return (Criteria) this;
        }

        public Criteria andCertificateholdIsNotNull() {
            addCriterion("certificateHold is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateholdEqualTo(String value) {
            addCriterion("certificateHold =", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdNotEqualTo(String value) {
            addCriterion("certificateHold <>", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdGreaterThan(String value) {
            addCriterion("certificateHold >", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdGreaterThanOrEqualTo(String value) {
            addCriterion("certificateHold >=", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdLessThan(String value) {
            addCriterion("certificateHold <", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdLessThanOrEqualTo(String value) {
            addCriterion("certificateHold <=", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdLike(String value) {
            addCriterion("certificateHold like", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdNotLike(String value) {
            addCriterion("certificateHold not like", value, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdIn(List<String> values) {
            addCriterion("certificateHold in", values, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdNotIn(List<String> values) {
            addCriterion("certificateHold not in", values, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdBetween(String value1, String value2) {
            addCriterion("certificateHold between", value1, value2, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andCertificateholdNotBetween(String value1, String value2) {
            addCriterion("certificateHold not between", value1, value2, "certificatehold");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocIsNull() {
            addCriterion("isFamilyDoc is null");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocIsNotNull() {
            addCriterion("isFamilyDoc is not null");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocEqualTo(Byte value) {
            addCriterion("isFamilyDoc =", value, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocNotEqualTo(Byte value) {
            addCriterion("isFamilyDoc <>", value, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocGreaterThan(Byte value) {
            addCriterion("isFamilyDoc >", value, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocGreaterThanOrEqualTo(Byte value) {
            addCriterion("isFamilyDoc >=", value, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocLessThan(Byte value) {
            addCriterion("isFamilyDoc <", value, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocLessThanOrEqualTo(Byte value) {
            addCriterion("isFamilyDoc <=", value, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocIn(List<Byte> values) {
            addCriterion("isFamilyDoc in", values, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocNotIn(List<Byte> values) {
            addCriterion("isFamilyDoc not in", values, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocBetween(Byte value1, Byte value2) {
            addCriterion("isFamilyDoc between", value1, value2, "isfamilydoc");
            return (Criteria) this;
        }

        public Criteria andIsfamilydocNotBetween(Byte value1, Byte value2) {
            addCriterion("isFamilyDoc not between", value1, value2, "isfamilydoc");
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

        public Criteria andRelnubcountIsNull() {
            addCriterion("relNubCount is null");
            return (Criteria) this;
        }

        public Criteria andRelnubcountIsNotNull() {
            addCriterion("relNubCount is not null");
            return (Criteria) this;
        }

        public Criteria andRelnubcountEqualTo(Byte value) {
            addCriterion("relNubCount =", value, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountNotEqualTo(Byte value) {
            addCriterion("relNubCount <>", value, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountGreaterThan(Byte value) {
            addCriterion("relNubCount >", value, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountGreaterThanOrEqualTo(Byte value) {
            addCriterion("relNubCount >=", value, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountLessThan(Byte value) {
            addCriterion("relNubCount <", value, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountLessThanOrEqualTo(Byte value) {
            addCriterion("relNubCount <=", value, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountIn(List<Byte> values) {
            addCriterion("relNubCount in", values, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountNotIn(List<Byte> values) {
            addCriterion("relNubCount not in", values, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountBetween(Byte value1, Byte value2) {
            addCriterion("relNubCount between", value1, value2, "relnubcount");
            return (Criteria) this;
        }

        public Criteria andRelnubcountNotBetween(Byte value1, Byte value2) {
            addCriterion("relNubCount not between", value1, value2, "relnubcount");
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