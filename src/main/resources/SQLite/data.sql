-- Divisas iniciales
INSERT INTO currency (code, name, exchange_rate) VALUES ('USD', 'Dólar Estadounidense', 1.0);
INSERT INTO currency (code, name, exchange_rate) VALUES ('EUR', 'Euro', 0.9);
INSERT INTO currency (code, name, exchange_rate) VALUES ('JPY', 'Yen Japonés', 110.0);

-- Transacciones de ejemplo
INSERT INTO transaction (type, amount, date, currency_id)
VALUES ('Compra', 1000.0, '2024-12-23', 1);
INSERT INTO transaction (type, amount, date, currency_id)
VALUES ('Venta', 500.0, '2024-12-22', 2);
