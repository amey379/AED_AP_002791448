INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Supplier','Employee Management');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Supplier','Order Management');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Supplier','Warehouse Manangement');

INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Retails','Inventory Manangement');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Retails','Employee Management');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Retails','Order Management');

INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Hospital','Order Management');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Hospital','Employee Management');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Hospital','Drug Stock Management');

INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Doordash','Employee Management');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Doordash','Delivery Management');
INSERT INTO organizationtypes (ent_type,org_type)
VALUES ('Doordash','Service Support');

INSERT INTO roletypes (ent_type,role_type)
VALUES ('Supplier','System Admin');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Retails','System Admin');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Hospital','System Admin');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Doordash','System Admin');

INSERT INTO roletypes (ent_type,role_type)
VALUES ('Supplier','Order Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Retails','Order Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Hospital','Order Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Doordash','Order Manager');

INSERT INTO roletypes (ent_type,role_type)
VALUES ('Supplier','Employee Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Retails','Employee Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Hospital','Employee Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Doordash','Employee Manager');

INSERT INTO roletypes (ent_type,role_type)
VALUES ('Supplier','Supplier Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Supplier','Warehouse Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Supplier','Employee');

INSERT INTO roletypes (ent_type,role_type)
VALUES ('Retails','Retails Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Retails','Inventory Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Retails','Employee');



INSERT INTO roletypes (ent_type,role_type)
VALUES ('Hospital','Hospital Admin');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Hospital','Drug Stock Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Hospital','Doctor');

INSERT INTO roletypes (ent_type,role_type)
VALUES ('Doordash','Delivery Manager');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Doordash','Delivery Agent');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Doordash','Customer Support');
INSERT INTO roletypes (ent_type,role_type)
VALUES ('Doordash','Customer');