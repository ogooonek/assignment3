package t1;

class BalanceHandler extends Handler {
    @Override
    public boolean handle(Request request) {
        if (request.balance >= request.rideCost) {
            System.out.println("Баланс клиента в порядке!");
            if (nextHandler != null) {
                return nextHandler.handle(request);
            }
            return true;
        } else {
            System.out.println("Недостаточно средств на балансе.");
            return false;
        }
    }
}
