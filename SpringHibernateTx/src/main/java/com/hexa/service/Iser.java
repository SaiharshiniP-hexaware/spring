package com.hexa.service;

import java.util.List;

import com.hexa.entity.Account;

public interface Iser {
int addAccount(List<Account> lst);
int transferFund(int from, int to, double amt);

}
