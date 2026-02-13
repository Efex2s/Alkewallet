# Análisis FODA - Aplicación AlkeWallet

Este documento presenta un análisis detallado de la aplicación AlkeWallet, identificando sus Fortalezas, Oportunidades, Debilidades y Amenazas.

## 1. Fortalezas (Strengths / Ventajas)
*   **Tecnologías Modernas de Android:** El proyecto utiliza `ViewBinding` para la vinculación de vistas, lo que reduce errores en tiempo de ejecución y mejora la legibilidad del código.
*   **Diseño de Interfaz Organizado:** El uso de `ConstraintLayout` permite crear interfaces flexibles y adaptables a diferentes tamaños de pantalla.
*   **Identidad Visual Definida:** La aplicación cuenta con una amplia gama de recursos gráficos (`drawables`) y estilos personalizados que le otorgan una apariencia coherente.
*   **Navegación Fluida:** El flujo de usuario principal (Splash Screen -> Login -> Home) está claramente definido e implementado mediante `Intents`.
*   **Gestión de Recursos:** Se observa el uso de `strings.xml` para centralizar los textos de la interfaz, facilitando el mantenimiento y futura localización.

## 2. Debilidades (Weaknesses)
*   **Ausencia de Lógica de Negocio Real:** La aplicación funciona actualmente como una maqueta visual. Los botones navegan entre pantallas pero no procesan ni almacenan datos.
*   **Falta de Persistencia de Datos:** No existe integración con bases de datos (Room) ni APIs. Datos como el saldo y transacciones están "hardcoded" en el XML.
*   **Redundancia de Código:** Clases como `Home_Page` y `Home_Page_Empty` duplican lógica casi idéntica, lo que aumenta la probabilidad de errores.
*   **Inconsistencias en Nomenclatura:** Mezcla de inglés y español en nombres de archivos (`enviarDinero.java` vs `Home_Page.java`) y estilos de escritura inconsistentes.
*   **Funcionalidades Incompletas:** Presencia de errores documentados en el código (ej: botón de perfil no funcional en `Home_Page.java`).
*   **Falta de Validación:** No existen validaciones en los campos de entrada para asegurar que los datos ingresados sean correctos o seguros.

## 3. Oportunidades (Oportunidades)
*   **Integración con Backend:** Conectar la app a Firebase o una REST API para permitir autenticación real y transacciones persistentes.
*   **Historial Dinámico:** Implementar un `RecyclerView` para mostrar un historial de transacciones real extraído de una base de datos.
*   **Seguridad Biométrica:** Integrar reconocimiento facial o huella dactilar para mejorar la seguridad del acceso.
*   **Funcionalidades de Billetera Avanzadas:** Añadir soporte para múltiples divisas, códigos QR y pagos de servicios.
*   **Notificaciones en Tiempo Real:** Alertar al usuario sobre movimientos en su cuenta mediante notificaciones push.

## 4. Amenazas (Amenazas)
*   **Riesgos de Seguridad:** La falta de cifrado y autenticación robusta representa un riesgo crítico para una aplicación que maneja activos financieros.
*   **Competencia Agresiva:** El sector Fintech cuenta con actores muy establecidos, lo que dificulta la adopción de nuevas billeteras sin una ventaja competitiva clara.
*   **Regulaciones Financieras:** El incumplimiento de normativas legales y bancarias locales puede impedir la operación legal de la aplicación.
*   **Obsolescencia Técnica:** El crecimiento desordenado mediante múltiples `Activities` en lugar de una arquitectura basada en `Fragments` puede generar deuda técnica difícil de pagar.
