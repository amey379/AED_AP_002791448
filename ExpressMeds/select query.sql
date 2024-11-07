/*Total enterprises*/
select count(distinct ent_type) from organizationtypes;
/*Total organizations*/
select count(*) from organizationtypes;
select count(distinct org_type) from organizationtypes;

/* Total roles */
select count(*) from  roletypes;

select count(distinct role_type) from  roletypes;