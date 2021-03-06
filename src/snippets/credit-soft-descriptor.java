// bankAccountHref is the stored href for the BankAccount
// orderHref is the stored href for the Order
BankAccount bankAccount = new BankAccount(bankAccountHref);

HashMap<String, Object> payload = new HashMap<String, Object>();
payload.put("amount", 100000);
payload.put("description", "Payout for order #1111");
payload.put("appears_on_statement_as", "GoodCo #1111");
payload.put("order", orderHref);

try {
    Credit credit = bankAccount.credit(payload);
}
catch (HTTPError e) {}