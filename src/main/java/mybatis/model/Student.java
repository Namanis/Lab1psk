package mybatis.model;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.ID
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    private Long id;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.FNAME
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    private String fname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.LNAME
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    private String lname;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    private Long universityId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.ID
     *
     * @return the value of PUBLIC.STUDENT.ID
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.ID
     *
     * @param id the value for PUBLIC.STUDENT.ID
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.FNAME
     *
     * @return the value of PUBLIC.STUDENT.FNAME
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    public String getFname() {
        return fname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.FNAME
     *
     * @param fname the value for PUBLIC.STUDENT.FNAME
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.LNAME
     *
     * @return the value of PUBLIC.STUDENT.LNAME
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    public String getLname() {
        return lname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.LNAME
     *
     * @param lname the value for PUBLIC.STUDENT.LNAME
     *
     * @mbg.generated Mon May 30 20:43:56 EEST 2022
     */
    public void setLname(String lname) {
        this.lname = lname;
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @return the value of PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @mbg.generated Mon May 02 20:43:56 EEST 2022
     */
    public Long getUniversityId() {
        return universityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @param universityId the value for PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @mbg.generated Mon May 02 20:43:56 EEST 2022
     */
    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }
}