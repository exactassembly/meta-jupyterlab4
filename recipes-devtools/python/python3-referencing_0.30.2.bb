
SUMMARY = "JSON Referencing + Python"
HOMEPAGE = "https://github.com/python-jsonschema/referencing"
AUTHOR = "Julian Berman <Julian+referencing@GrayVines.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=93eb9740964b59e9ba30281255b044e2"

SRC_URI[sha256sum] = "794ad8003c65938edcdbc027f1933215e0d0ccc0291e3ce20a4d87432b59efc0"

#S = "${WORKDIR}/referencing-0.30.2"

PYPI_PACKAGE = "referencing"

DEPENDS += "\
    ${PYTHON_PN}-hatch-vcs-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-attrs \
    ${PYTHON_PN}-rpds-py \
"

BBCLASSEXTEND = "native nativesdk"