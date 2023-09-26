
SUMMARY = "A Jupyter Server Extension Providing Terminals."
HOMEPAGE = "https://jupyter.org/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94ac070e045e2bb0b9fc9446315e8be1"

SRC_URI[sha256sum] = "57ab779797c25a7ba68e97bcfb5d7740f2b5e8a83b5e8102b10438041a7eac5d"

PYPI_PACKAGE = "jupyter_server_terminals"

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-terminado \
"

FILES:${PN} += "\
  /usr/etc \
  /usr/etc/jupyter \
  /usr/etc/jupyter/jupyter_server_config.d \
  /usr/etc/jupyter/jupyter_server_config.d/jupyter_server_terminals.json \
"