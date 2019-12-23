package com.revaturelabs.caliber.batch.revpro.dto;

import java.util.Objects;

public class AssociateDto {
  private String firstName;
  private String lastName;
  private String salesforceId;
  private String trainingStatus;

  public AssociateDto() {
  }

  public AssociateDto(String firstName, String lastName, String salesforceId, String trainingStatus) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salesforceId = salesforceId;
    this.trainingStatus = trainingStatus;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSalesforceId() {
    return salesforceId;
  }

  public void setSalesforceId(String salesforceId) {
    this.salesforceId = salesforceId;
  }

  public String getTrainingStatus() {
    return trainingStatus;
  }

  public void setTrainingStatus(String trainingStatus) {
    this.trainingStatus = trainingStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssociateDto that = (AssociateDto) o;
    return Objects.equals(getFirstName(), that.getFirstName()) &&
      Objects.equals(getLastName(), that.getLastName()) &&
      Objects.equals(getSalesforceId(), that.getSalesforceId()) &&
      Objects.equals(getTrainingStatus(), that.getTrainingStatus());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName(), getSalesforceId(), getTrainingStatus());
  }

  @Override
  public String toString() {
    return "AssociateDto{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", salesforceId='" + salesforceId + '\'' +
      ", trainingStatus='" + trainingStatus + '\'' +
      '}';
  }
}
