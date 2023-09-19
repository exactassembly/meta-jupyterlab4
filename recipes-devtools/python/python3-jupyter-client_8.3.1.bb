
SUMMARY = "Jupyter protocol implementation and client libraries"
HOMEPAGE = "https://jupyter.org/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

SRC_URI[sha256sum] = "60294b2d5b869356c893f57b1a877ea6510d60d45cf4b38057f1672d85699ac9"

PYPI_PACKAGE = "jupyter_client"

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-jupyter-core \
    ${PYTHON_PN}-dateutil \
    ${PYTHON_PN}-pyzmq \
    ${PYTHON_PN}-tornado \
    ${PYTHON_PN}-traitlets \
"

BBCLASSEXTEND = "native nativesdk"