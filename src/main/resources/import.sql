insert into Category (id, c_name, c_Description, img_url) values ('1', 'Pork', 'Pork Meeet', 'https://i.imgur.com/VbTpOcg.png');
insert into Category (id, c_Name, c_Description, img_url) values ('2', 'Beef', 'Beeeeef Meeet', 'https://i.imgur.com/fAqwhzz.png');
insert into Category (id, c_Name, c_Description, img_url) values ('3', 'Asian', 'Rice', 'https://i.imgur.com/bjpOp81.png');
insert into Category (id, c_Name, c_Description, img_url) values ('4', 'Vege', 'Vegetablesss!', 'https://i.imgur.com/MlPBf1H.png');

insert into Tag (id, t_name) values ('1', 'Meat');
insert into Tag (id, t_name) values ('2', 'Vegetables');

insert into tag_category (fk_tag, fk_category) values (1, 1);
insert into tag_category (fk_tag, fk_category) values (1, 2);
insert into tag_category (fk_tag, fk_category) values (2, 4);

insert into ingredient (id, i_name) values (1, 'Carrot');
insert into ingredient (id, i_name) values (2, 'Onion');
insert into ingredient (id, i_name) values (3, 'Tomato');
insert into ingredient (id, i_name) values (4, 'Beef');
insert into ingredient (id, i_name) values (5, 'Rice');
insert into ingredient (id, i_name) values (6, 'Pork');

insert into quantity (id, q_value, ingredient_id) values (1, 200, 1);
insert into quantity (id, q_value, ingredient_id) values (2, 100, 3);
insert into quantity (id, q_value, ingredient_id) values (3, 400, 4);

insert into recipe (id, r_name, r_description) values (1, 'Tomato soup', 'Simple tomato soup');

insert into quantity_recipe (fk_quantity, fk_recipe) values (1, 1);

insert into category_recipe (fk_category, fk_recipe) values (1, 1);