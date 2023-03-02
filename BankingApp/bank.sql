create database bank;
use bank;
create table user(
	user_id bigint primary key auto_increment,
    acc_holder_name varchar(30), 
    address varchar(50), 
	email varchar(30) unique, 
    mob_no int unique
);

insert into user(user_id,  email, acc_holder_name, address, mob_no) 
			value(1, "shivam@gmail.com", "Shivam Kumar", "Jharkhand", 90876558),
				  (2, "keh@gmail.com", "Keshav Kumar", "Bihar", 756453123);
                  
create table account(
	account_no int primary key auto_increment,
    user_id bigint unique not null,
    acc_type varchar(30), 
    branch varchar(50), 
    balance bigint,
    foreign key (user_id)references user(user_id)
);

insert into account(account_no, user_id, acc_type, branch, balance)
			value(101, 1, "Savings", "Phushro", 10243952437),
				  (102, 2, "Current", "Deoghar", 232324323);

create table loan(
	loan_id int primary key auto_increment,
    loan_amount bigint , 
    user_id bigint not null, 
    date_of_sanction date, 
    loan_duration int,
    foreign key (user_id) references user(user_id)
);

insert into loan(loan_id, loan_amount, user_id, date_of_sanction, loan_duration)
			value(1, 13243546, 1, "	2008-11-11", 2),
				  (2, 98765124, 2, "2011-09-01", 3);
				 
create table transactions(
	transaction_id int primary key auto_increment, 
    transaction_amount bigint,
    from_user_id bigint, 
    to_user_id bigint, 
    time_of_transaction datetime, 
    foreign key (from_user_id) references user(user_id),
    foreign key (to_user_id) references user(user_id)
);

insert into transactions(transaction_id, transaction_amount, from_user_id, to_user_id, time_of_transaction)
						value(1, 13243, 1, 2, "2008-11-11 13:23:44"),
							  (2, 2435, 2, 1, "2008-09-09 13:23:44");
					


