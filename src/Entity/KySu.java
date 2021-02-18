package Entity;

public class KySu extends Employee {
      private String major;

      /**
       * @return the major
       */
      public String getMajor() {
            return major;
      }

      /**
       * @param major the major to set
       */
      public void setMajor(String major) {
            this.major = major;
      }

      /**
       * 
       */
      public KySu() {
      }

      /**
       * @param fullName
       * @param dateofBirth
       * @param gender
       * @param major
       */
      public KySu(String fullName, String dateofBirth, String gender, String major) {
            super(fullName, dateofBirth, gender);
            this.major = major;
      }
}
