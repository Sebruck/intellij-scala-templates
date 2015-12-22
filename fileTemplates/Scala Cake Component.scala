#if ((${PACKAGE_NAME} && ${PACKAGE_NAME} != ""))package ${PACKAGE_NAME} #end
trait ${NAME}Component {
  def ${NAME.charAt(0).toString().toLowerCase()}${NAME.substring(1)}: ${NAME}
  
  trait ${NAME} {
  }
}

trait ${NAME}ComponentImpl extends ${NAME}Component {
  override lazy val ${NAME.charAt(0).toString().toLowerCase()}${NAME.substring(1)}: ${NAME}Impl = new ${NAME}Impl
  
  class ${NAME}Impl extends ${NAME} {
  }
}
