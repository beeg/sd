CREATE DATABASE sdp;

GRANT ALTER, SELECT,INSERT,UPDATE,DELETE,CREATE,DROP, INDEX 
           ON sdp.*
           TO sdp@'%'
           IDENTIFIED BY 'sdp';

GRANT ALTER, SELECT,INSERT,UPDATE,DELETE,CREATE,DROP, INDEX
           ON sdp.*
           TO sdp@localhost
           IDENTIFIED BY 'sdp';