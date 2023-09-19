
SUMMARY = "Jupyter core package. A base package on which Jupyter projects rely."
HOMEPAGE = ""
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.org>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5cc41e8bc83e8e689ce2c7bb0ceba14"

SRC_URI[sha256sum] = "5ba5c7938a7f97a6b0481463f7ff0dbac7c15ba48cf46fa4035ca6e838aa1aba"

PYPI_PACKAGE = "jupyter_core"

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-platformdirs \
    ${PYTHON_PN}-traitlets \
"

BBCLASSEXTEND = "native nativesdk"