INSERT INTO addresses (city,address_line1,address_line2,created_at,latitude,longitude,modified_at,zip) VALUES
('Singapore','2 Jurong East Street ',NULL,'2020-11-26 01:14:46.976',1.351616,103.808053,'2020-11-26 01:15:32.177','609601')
,('Singapore','1 Kim Seng Promenade','#14-07 Great World City','2020-11-26 01:16:21.339',1.3992348,103.8147471,'2020-11-26 01:16:23.661','237994')
;

INSERT INTO contact_details (contact_type,created_at,modified_at,value) VALUES
('PHONE','2020-11-26 01:19:21.648','2020-11-26 01:19:23.522','62723250')
,('PHONE','2020-11-26 01:19:55.317','2020-11-26 01:19:57.439','62723251')
;

-- Auto-generated SQL script #202011260123
INSERT INTO shops (created_at,currency_code,location_name,modified_at,queue_count,queue_size)
	VALUES ('2020-11-26 01:22:18.140','SGD','Rochor Centre','2020-11-26 01:23:10.654',3,50);

-- Auto-generated SQL script #202011260124
INSERT INTO shops_addresses (shop_id,addresses_id)
	VALUES (1,1);

	-- Auto-generated SQL script #202011260125
INSERT INTO shops_contact_details (shop_id,contact_details_id)
	VALUES (1,1);

-- Auto-generated SQL script #202011260126
INSERT INTO shop_timings (close_time,created_at,modified_at,open_time,shop_id)
	VALUES ('22:00','2020-11-26 01:26:03.791','2020-11-26 01:26:05.886','08:00',1);

-- Auto-generated SQL script #202011260126
INSERT INTO shop_menu (created_at,modified_at,notes,shop_id) VALUES
('2020-11-26 01:47:46.297','2020-11-26 01:47:48.648','All hot coffee serving size is 200ml. Cold coffee serving size is 300ml.',1)
;

INSERT INTO shop_menu_groups (created_at,modified_at,notes,menu_id,"name") VALUES
('2020-11-26 02:02:23.998','2020-11-26 02:02:25.824',NULL,1,'Hot Coffee')
;

-- Auto-generated SQL script #202011260208
INSERT INTO public.shop_menu_groups (created_at,modified_at,"name",notes,menu_id)
VALUES ('2020-11-26 02:08:11.677','2020-11-26 02:08:13.811','Cold Coffee','Served cold with Ice Cream',1);


-- Auto-generated SQL script #202011260207
INSERT INTO public.shop_menu_items (created_at,modified_at,"name",price,menu_group_id)
VALUES ('2020-11-26 02:05:37.243','2020-11-26 02:05:59.338','Espresso',5.5,1);
INSERT INTO public.shop_menu_items (created_at,modified_at,"name",price,menu_group_id)
VALUES ('2020-11-26 02:06:23.707','2020-11-26 02:06:26.495','Cappuccino',8.3,1);
INSERT INTO public.shop_menu_items (created_at,modified_at,"name",price,menu_group_id)
VALUES ('2020-11-26 02:07:17.237','2020-11-26 02:07:19.125','MOCHA',9,1);

-- Auto-generated SQL script #202011260210
INSERT INTO public.shop_menu_items (created_at,description,modified_at,"name",price,menu_group_id)
VALUES ('2020-11-26 02:09:07.848','Our signature Cold Brew','2020-11-26 02:09:11.142','Blend Nō 01',12.5,2);
INSERT INTO public.shop_menu_items (created_at,description,modified_at,"name",price,menu_group_id)
VALUES ('2020-11-26 02:10:12.008','Refreshing and Seasonal','2020-11-26 02:10:14.125','Summer 2020',11.5,2);

-- Auto-generated SQL script #202011260212
-- Password : Password@1
INSERT INTO public.users (created_at,modified_at,"name", username, password, enabled)
VALUES ('2020-11-26 02:11:52.939','2020-11-26 02:11:55.144','Dhaval Mehta', 'dhaval', '$2y$12$nIg5HoXb.Okfzyu.C5PwKOPkvdusbW6WzM1vdHUKj2J74/8PoS/PO', true);
INSERT INTO public.users (created_at,modified_at,"name", username, password, enabled)
VALUES ('2020-11-26 02:12:12.316','2020-11-26 02:12:14.325','John Doe', 'john', '$2y$12$nIg5HoXb.Okfzyu.C5PwKOPkvdusbW6WzM1vdHUKj2J74/8PoS/PO', true);

-- Auto-generated SQL script #202011260213
INSERT INTO public.users_addresses (users_id,addresses_id)
VALUES (1,2);

-- Auto-generated SQL script #202011260213
INSERT INTO public.users_contact_details (users_id,contact_details_id)
VALUES (1,2);

-- Auto-generated SQL script #202011260214
INSERT INTO public.shop_users (created_at,modified_at,"role",shop_id,user_id)
VALUES ('2020-11-26 02:14:31.708','2020-11-26 02:14:33.755','OWNER',1,2);

-- Auto-generated SQL script #202011260217
-- Auto-generated SQL script #202011260217
INSERT INTO public.shop_queues (active,created_at,modified_at,queue_no,shop_id, avg_processing_duration)
VALUES (true,'2020-11-26 02:17:29.823','2020-11-26 02:17:32.588',1,1, 180);
INSERT INTO public.shop_queues (active,created_at,modified_at,queue_no,shop_id, avg_processing_duration)
VALUES (true,'2020-11-26 02:17:34.611','2020-11-26 02:17:37.069',2,1, 180);
INSERT INTO public.shop_queues (active,created_at,modified_at,queue_no,shop_id, avg_processing_duration)
VALUES (true,'2020-11-26 02:17:08.939','2020-11-26 02:17:11.950',3,1, 180);

