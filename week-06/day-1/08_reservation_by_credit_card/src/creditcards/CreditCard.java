package creditcards;

import java.util.Random;

public class CreditCard implements CreditCardy {
  String codeAccount;
  String cardholderName;

  public CreditCard(String name) {
    codeAccount = createCodeAccount();
    this.cardholderName = name;
  }

  @Override
  public String getCodeAccount() {
    return this.codeAccount;
  }

  @Override
  public String getNameCardholder() {
    return cardholderName;
  }

  public String createCodeAccount() {
    String CC = "";
    Random r = new Random();

    for (int i = 0; i < 16; i++) {
      CC += Integer.toString(r.nextInt(9));
    }

    return CC;
  }

  @Override
  public int getSumCVV() {
    return computeSumCVV(codeAccount);
  }

  @Override
  public int computeSumCVV(String codeAccount) {
    int output = 0;

    for (int i = 0; i < codeAccount.length(); i++) {
      output += Character.getNumericValue(codeAccount.charAt(i));
    }
    
    return output;
  }

  public String toString() {
    return String.format("Name=%s CC#=%s CVV=%d", cardholderName, getCodeAccount(), getSumCVV());
  }
}
