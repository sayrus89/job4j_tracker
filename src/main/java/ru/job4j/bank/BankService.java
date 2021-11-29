package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает простейшую модель для банковской системы.
 *
 * @author Saydaliev Rustam
 * @version 1.0
 */
public class BankService {

    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового клиента в систему.
     * Если клиент есть в системе, то нового добавлять не надо.
     *
     * @param user клиент банка типа User.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет клиента, если клиент уже есть и еще нет этого счета в системе.
     *
     * @param passport паспорт клиента типа String.
     * @param account  новый счет типа Account.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    /**
     * Метод ищет клиента по номеру паспорта.
     *
     * @param passport паспорт клиента типа String.
     * @return Возвращает клиента типа User. Если клиента нет, то возвращает null.
     */
    public User findByPassport(String passport) {
        for (User keyUser : users.keySet()) {
            if (keyUser.getPassport().equals(passport)) {
                return keyUser;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам.
     *
     * @param passport  паспорт типа String.
     * @param requisite реквизит типа String.
     * @return возвращает счет клиента типа Account,
     * если по номеру паспорта есть клиент и по реквизиту есть его счет в системе,
     * иначе возвращает null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            for (Account account : accountList) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит деньги со счета клиента насчет другого клиента.
     *
     * @param srcPassport   паспорт клиента отправителя типа String.
     * @param srcRequisite  реквизит счета клиента отправителя типа String.
     * @param destPassport  паспорт клиента получателя типа String.
     * @param destRequisite реквизит счета клиента получателя типа String.
     * @param amount        сумма перевода типа double.
     * @return возвращает true, если счёта клиентов найдены и хватает денег на счёте отправителя,
     * иначе false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
