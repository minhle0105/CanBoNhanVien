package Entity;

public class Employee {
      private String fullName;
      private String dateofBirth;
      private String gender;

      /**
       * @return the fullName
       */
      public String getFullName() {
            return fullName;
      }

      /**
       * @param fullName the fullName to set
       */
      public void setFullName(String fullName) {
            this.fullName = fullName;
      }

      /**
       * @return the dateofBirth
       */
      public String getDateofBirth() {
            return dateofBirth;
      }

      /**
       * @param dateofBirth the dateofBirth to set
       */
      public void setDateofBirth(String dateofBirth) {
            this.dateofBirth = dateofBirth;
      }

      /**
       * @return the gender
       */
      public String getGender() {
            return gender;
      }

      /**
       * @param gender the gender to set
       */
      public void setGender(String gender) {
            this.gender = gender;
      }

      /**
       * 
       */
      public Employee() {
      }

      /**
       * @param fullName
       * @param dateofBirth
       * @param gender
       */
      public Employee(String fullName, String dateofBirth, String gender) {
            this.fullName = fullName;
            this.dateofBirth = dateofBirth;
            this.gender = gender;
      }

      /*
       * (non-Javadoc)
       * 
       * @see java.lang.Object#toString()
       */

      @Override
      public String toString() {
            return "Employee [fullName = " + fullName + ", dateOfBirth = " + dateofBirth + 
            ", gender = " + gender + "]";
      }

      
}
