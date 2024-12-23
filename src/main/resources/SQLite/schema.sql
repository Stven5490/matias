-- Tabla de divisas
CREATE TABLE IF NOT EXISTS currency (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    code TEXT NOT NULL,
    name TEXT NOT NULL,
    exchange_rate REAL NOT NULL
);

-- Tabla de transacciones
CREATE TABLE IF NOT EXISTS transaction (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    type TEXT NOT NULL,
    amount REAL NOT NULL,
    date TEXT NOT NULL,
    currency_id INTEGER NOT NULL,
    FOREIGN KEY (currency_id) REFERENCES currency(id)
);
