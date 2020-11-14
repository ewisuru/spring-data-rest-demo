insert into user_info (user_id, name, mobile_number)
 values
 (1, 'user1', '1234567890'),
 (2, 'user2', '11112222'),
 (3, 'user3', '22223333'),
 (4, 'user4', '33334444');

insert into account_info (account_id, account_number, account_type, account_status, accounts_user_id)
 values
 (1, '008-13243546', 'SAVINGS', 'ACTIVE', 1),
 (2, '008-09827483', 'SAVINGS', 'SUSPENDED', 1),
 (3, '011-21546321', 'CREDIT', 'SUSPENDED', 1),
 (4, '013-34123212', 'CURRENT', 'SUSPENDED', 1);