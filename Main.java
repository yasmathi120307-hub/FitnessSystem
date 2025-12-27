/*
create classes member,gym member,yoga member,main and declare the variables which need to be in that classes
add the getter and setter methods for all the variables in all the classes
create objects in main and set the value of variables
create methods in membership files enroll cancel and unique feature to yoga and gym
and alter the main and print it
now create abstract class and then interface for redundancy and security
if statements
 */

public class Main {
   public static void main(String[] args) {

      //basic requirements
      //member1
      MemberInterface member1 = new Member();
      member1.setMemberId(1234);
      member1.setMembershipType("Gym");
      member1.setMonths(6);

      //if statement
      if (member1.getMembershipType() == "Gym") {
         GymMembershipInterface gymmembership = new GymMembership();
         gymmembership.setMemberId(member1.getMemberId());
         gymmembership.setFee(1000);
         System.out.println("MEMBER 1");
         System.out.println(gymmembership.getMemberId());
         gymmembership.enroll(member1.getMonths());
         gymmembership.cancelMembership();
         gymmembership.personalTrainer();
      }
      else{
         YogaMembershipInterface yogamembership = new YogaMembership();
         yogamembership.setMemberId(member1.getMemberId());
         yogamembership.setFee(800);
         System.out.println("MEMBER 1");
         yogamembership.enroll(member1.getMonths());
         yogamembership.cancelMembership();
         yogamembership.meditationClass();

      }
      //member2
      MemberInterface member2 = new Member();
      member2.setMemberId(5678);
      member2.setMembershipType("Yoga");
      member2.setMonths(4);

      if (member2.getMembershipType() == "Gym") {
         GymMembershipInterface gymmembership = new GymMembership();
         gymmembership.setMemberId(member2.getMemberId());
         gymmembership.setFee(1000);
         System.out.println("MEMBER 2");
         System.out.println(gymmembership.getMemberId());
         gymmembership.enroll(member2.getMonths());
         gymmembership.cancelMembership();
         gymmembership.personalTrainer();
      } else {
         YogaMembershipInterface yogamembership = new YogaMembership();
         yogamembership.setMemberId(member2.getMemberId());
         yogamembership.setFee(800);
         System.out.println("MEMBER 2");
         yogamembership.enroll(member2.getMonths());
         yogamembership.cancelMembership();
         yogamembership.meditationClass();

      }
   }
}

