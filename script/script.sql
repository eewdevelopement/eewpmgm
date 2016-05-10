DROP DATABASE IF EXISTS college_management_System;
create database college_management_System;
use  college_management_System;

create table tbl_profile(
    `id` int(10) primary key auto_increment,
    `full_name` varchar(30) not null,
    `contact_no` varchar(30) not null,
    `land_line_no` varchar(30) ,
    `email_id` varchar(30) not null,
    `password` varchar(30) not null,
    `security_question` varchar(100) not null,
    `answer` varchar(30) not null,
    `college_name` varchar(50) not null,
    `college_address` varchar(300) not null,
    `college_time` varchar(20) not null,
    `no_of_branches` int(2) not null,
    `is_active` char(1) default null
);

create table tbl_guide(
    `id` int(10) primary key auto_increment,
    `profile_id` int(10) default null,
    `full_name` varchar(30) not null,
    `contact_no` varchar(30) not null,
    `land_line_no` varchar(30) ,
    `email_id` varchar(30) not null,
    `Password` varchar(30) not null,
    `security_question` varchar(100) not null,
    `answer` varchar(30) not null,
    `branch_name` varchar(50) not null,
    `max_group` int(3) not null,
    `from_duration` varchar(30) default null,
    `to_duration` varchar(30) default null,
    `is_active` char(1) default null,
    `create_by` int(2) default null,
    `updated_by` int(2) default null,
    `create_on` varchar(30)default null,
    `updated_on` varchar(30) default null,
     foreign key (`profile_id`) references `tbl_profile`(`id`) 
);

create table tbl_hod(
    `id` int(10) primary key auto_increment,
    `profile_id` int(30) default null,
    `full_name` varchar(30) not null,
    `contact_no` varchar(30) not null,
    `land_line_no` varchar(30) ,
    `email_id` varchar(30) not null,
    `password` varchar(30) not null,
    `security_question` varchar(100) not null,
    `answer` varchar(30) not null,
    `brach_name` varchar(20) not null,
    `from_duration` varchar(20) not null,
    `to_duration` varchar(20) not null,
    `is_active` char(1) default null,
    `create_by` int(2) default null,
    `updated_by` int(2) default null,
    `create_on` date default null,
    `updated_on` date default null,
    foreign key (`profile_id`) references `tbl_profile`(`id`) 
);

create table tbl_project_group(
    `id` int(11) primary key auto_increment,
    `profile_id` int(11) not null,
    `group_code` varchar(20) not null,
    `brach_name` varchar(30) not null,
    `groupP_student` int(2) ,
    `project_title` varchar(20) not null,
    `project_domain` varchar(20) not null,
    `group username` varchar(30) not null,
    `group password` varchar(30) not null,
    `project_language` varchar(20) not null,
    `is_active` char(1) default null,
    `create_by` int(2) default null,
    `updated_by` int(2) default null,
    `create_on` date default null,
    `updated_on` date default null,
    foreign key (`profile_id`) references `tbl_profile`(`id`)
);

create table tbl_group_student(
    `id` int(11) primary key auto_increment,
    `profile_id` int(11) default null,
    `group_id` int(11) default null,
    `student_name` varchar(30) not null,
    `student_contact`varchar(30) not null,
    `student_email` varchar(30) not null,
    foreign key (`profile_id`) references `tbl_profile`(`id`),
    foreign key (`group_id`) references `tbl_project_group`(`id`)
);

