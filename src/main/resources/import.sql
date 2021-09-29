/* Populate tables */
INSERT INTO brand(id, name) VALUES(1, 'ZARA');
INSERT INTO brand(id, name) VALUES(2, 'OYSHO');
INSERT INTO brand(id, name) VALUES(3, 'MASSIMO DUTTI');


INSERT INTO price(id_price, start_date, end_date, price_list, product, priority, price, curr, brand_id) VALUES(1, parsedatetime('2020-06-14-00.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-12-31-23.59.59', 'yyyy-MM-dd-HH.mm.ss'), 1, 35455, 0, 35.50, 'EUR', 5);
INSERT INTO price(id_price, start_date, end_date, price_list, product, priority, price, curr, brand_id) VALUES(2, parsedatetime('2020-06-14-15.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-06-14-18.30.00', 'yyyy-MM-dd-HH.mm.ss'), 2, 35456, 1, 25.45, 'EUR', 6);
INSERT INTO price(id_price, start_date, end_date, price_list, product, priority, price, curr, brand_id) VALUES(3, parsedatetime('2020-06-15-00.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-06-15-11.00.00', 'yyyy-MM-dd-HH.mm.ss'), 3, 35457, 1, 30.50, 'EUR', 7);
INSERT INTO price(id_price, start_date, end_date, price_list, product, priority, price, curr, brand_id) VALUES(4, parsedatetime('2020-06-15-16.00.00', 'yyyy-MM-dd-HH.mm.ss'), parsedatetime('2020-12-31-23.59.59', 'yyyy-MM-dd-HH.mm.ss'), 4, 35458, 1, 38.95, 'EUR', 8);