CREATE TABLE divisas (
    id INT IDENTITY PRIMARY KEY,
    monedaOrigen NVARCHAR(3),
    monedaDestino NVARCHAR(3),
    monto DECIMAL(18, 2),
    tasa DECIMAL(10, 4),
    fecha DATETIME DEFAULT GETDATE()
);