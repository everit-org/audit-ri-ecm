package org.everit.audit.ri.ecm;

/**
 * Audit RI Component configuration constants.
 */
public final class AuditRiComponentConstants {

  public static final String ATTR_AUDIT_APPLICATION_CACHE = "auditApplicationCache.target";

  public static final String ATTR_AUDIT_APPLICATION_MANAGER = "auditApplicationManager.target";

  public static final String ATTR_AUDIT_EVENT_TYPE_CACHE = "auditEventTypeCache.target";

  public static final String ATTR_AUTHENTICATION_PROPAGATOR = "authenticationPropagator.target";

  public static final String ATTR_AUTHNR_PERMISSION_CHECKER = "authnrPermissionChecker.target";

  public static final String ATTR_AUTHORIZATION_MANAGER = "authorizationManager.target";

  public static final String ATTR_EMBEDDED_AUDIT_APPLICATION_NAME = "embeddedAuditApplicationName";

  public static final String ATTR_INTERNAL_AUDIT_EVENT_TYPE_MANAGER =
      "internalAuditEventTypeManager.target";

  public static final String ATTR_INTERNAL_LOGGING_SERVICE = "internalLoggingService.target";

  public static final String ATTR_PERMISSION_CHECKER = "permissionChecker.target";

  public static final String ATTR_PROPERTY_MANAGER = "propertyManager.target";

  public static final String ATTR_QUERYDSL_SUPPORT = "querydslSupport.target";

  public static final String ATTR_RESOURCE_SERVICE = "resourceService.target";

  public static final String ATTR_TRASACTION_PROPAGATOR = "transactionPropagator.target";

  public static final String DEFAULT_CACHE_TARGET = "(MUST_BE_SET=TO_SOMETHING)";

  public static final String EMBEDDED_DEFAULT_SERVICE_DESCRIPTION =
      "Default Embedded Audit Component";

  public static final String EMBEDDED_SERVICE_FACTORY_PID =
      "org.everit.audit.ri.ecm.EmbeddedAuditComponent";

  public static final String INTERNAL_DEFAULT_SERVICE_DESCRIPTION =
      "Default Internal Audit Component";

  public static final String INTERNAL_SERVICE_FACTORY_PID =
      "org.everit.audit.ri.ecm.InternalAuditComponent";

  private AuditRiComponentConstants() {
  }

}
