package org.example.dataobject;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table USER_PASSWORD
 *
 * @mbg.generated do_not_delete_during_merge Fri Apr 24 15:56:03 CST 2020
 */
public class UserPasswordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PASSWORD.ID
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PASSWORD.ENCRPT_PASSWORD
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    private String encrptPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_PASSWORD.USER_ID
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PASSWORD.ID
     *
     * @return the value of USER_PASSWORD.ID
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PASSWORD.ID
     *
     * @param id the value for USER_PASSWORD.ID
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PASSWORD.ENCRPT_PASSWORD
     *
     * @return the value of USER_PASSWORD.ENCRPT_PASSWORD
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    public String getEncrptPassword() {
        return encrptPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PASSWORD.ENCRPT_PASSWORD
     *
     * @param encrptPassword the value for USER_PASSWORD.ENCRPT_PASSWORD
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    public void setEncrptPassword(String encrptPassword) {
        this.encrptPassword = encrptPassword == null ? null : encrptPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_PASSWORD.USER_ID
     *
     * @return the value of USER_PASSWORD.USER_ID
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_PASSWORD.USER_ID
     *
     * @param userId the value for USER_PASSWORD.USER_ID
     *
     * @mbg.generated Fri Apr 24 15:56:03 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}